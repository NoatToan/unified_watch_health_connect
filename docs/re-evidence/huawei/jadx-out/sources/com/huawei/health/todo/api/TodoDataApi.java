package com.huawei.health.todo.api;

import android.app.Activity;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import defpackage.ikw;

/* JADX INFO: loaded from: classes.dex */
public interface TodoDataApi {
    void addNewTodoInfo(ikw ikwVar, IBaseResponseCallback iBaseResponseCallback);

    Class<?> getTodoJsClass();

    void getTodoListFromCloud(String str, IBaseResponseCallback iBaseResponseCallback);

    void hideOrShowTodoFloatView(Activity activity, boolean z);

    boolean isMainSwitchChecked();

    boolean isShowTodo();

    void refreshTodoList(IBaseResponseCallback iBaseResponseCallback);

    void removeTodoFloatView();

    void updateTodoInfo(ikw ikwVar, IBaseResponseCallback iBaseResponseCallback);
}
