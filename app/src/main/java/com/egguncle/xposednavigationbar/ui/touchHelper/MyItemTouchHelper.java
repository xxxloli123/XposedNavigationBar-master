/*
 *     Navigation bar function expansion module
 *     Copyright (C) 2017 egguncle cicadashadow@gmail.com
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.egguncle.xposednavigationbar.ui.touchHelper;

import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created by egguncle on 17-6-7.
 */

public class MyItemTouchHelper extends ItemTouchHelper {
    private MyItemTouchHelpCallBack itemTouchHelpCallback;

    public MyItemTouchHelper(MyItemTouchHelpCallBack.OnItemTouchCallbackListener onItemTouchCallbackListener) {
        super(new MyItemTouchHelpCallBack(onItemTouchCallbackListener));
       // itemTouchHelpCallback = (MyItemTouchHelpCallBack) getCallback();
    }

//    /**
//     * 设置是否可以被拖拽
//     *
//     * @param canDrag 是true，否false
//     */
//    public void setDragEnable(boolean canDrag) {
//        itemTouchHelpCallback.setDragEnable(canDrag);
//    }
//
//    /**
//     * 设置是否可以被滑动
//     *
//     * @param canSwipe 是true，否false
//     */
//    public void setSwipeEnable(boolean canSwipe) {
//        itemTouchHelpCallback.setSwipeEnable(canSwipe);
//    }
}
