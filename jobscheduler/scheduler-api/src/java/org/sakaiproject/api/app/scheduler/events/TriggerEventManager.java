/**********************************************************************************
* $URL: https://source.sakaiproject.org/svn/jobscheduler/trunk/scheduler-api/src/java/org/sakaiproject/api/app/scheduler/JobBeanWrapper.java $
* $Id: JobBeanWrapper.java 105077 2012-02-24 22:54:29Z ottenhoff@longsight.com $
***********************************************************************************
*
 * Copyright (c) 2003, 2004, 2005, 2006, 2008 The Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.opensource.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*
**********************************************************************************/
package org.sakaiproject.api.app.scheduler.events;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: duffy
 * Date: Aug 26, 2010
 * Time: 3:40:13 PM
 * To change this template use File | Settings | File Templates.
 */
public interface TriggerEventManager
{
	/**
	 * 
	 * @param type
	 * @param jobName
	 * @param triggerName
	 * @param time
	 * @param message
	 * @param serverId the id of the server the job runs on
	 * @return
	 */
    public TriggerEvent createTriggerEvent (TriggerEvent.TRIGGER_EVENT_TYPE type, String jobName, String triggerName, Date time, String message, String ServerId);

    /**
     * 
     * @return
     */
    public List<TriggerEvent> getTriggerEvents ();

    /**
     * Get All triggers
     * @param after
     * @param before
     * @param jobs
     * @param triggerName
     * @param types
     * @return
     */
    public List<TriggerEvent> getTriggerEvents (Date after, Date before, List<String> jobs, String triggerName, TriggerEvent.TRIGGER_EVENT_TYPE[] types);

    /**
     * 
     * @param before
     */
    public void purgeEvents (Date before);
}
