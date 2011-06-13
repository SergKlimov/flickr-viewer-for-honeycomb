/*
 * Created on Jun 13, 2011
 *
 * Copyright (c) Sybase, Inc. 2011   
 * All rights reserved.                                    
 */

package com.charles.actions;

import android.app.Activity;

/**
 * @author qiangz
 */
public abstract class ActivityAwareAction implements IAction {

    protected Activity mActivity;

    public ActivityAwareAction(Activity activity) {
        this.mActivity = activity;
    }

}
