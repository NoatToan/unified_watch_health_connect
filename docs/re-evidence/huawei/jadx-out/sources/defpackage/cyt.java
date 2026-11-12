package defpackage;

import android.app.Activity;
import com.huawei.featureuserprofile.todo.TodoJsApi;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.todo.api.TodoDataApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwbasemgr.IBaseResponseCallback;

/* JADX INFO: loaded from: classes23.dex */
@ApiDefine(uri = TodoDataApi.class)
public class cyt implements TodoDataApi {
    @Override // com.huawei.health.todo.api.TodoDataApi
    public void getTodoListFromCloud(String str, IBaseResponseCallback iBaseResponseCallback) {
        czm.e(str, iBaseResponseCallback);
    }

    @Override // com.huawei.health.todo.api.TodoDataApi
    public void updateTodoInfo(ikw ikwVar, IBaseResponseCallback iBaseResponseCallback) {
        czm.b(ikwVar, iBaseResponseCallback);
    }

    @Override // com.huawei.health.todo.api.TodoDataApi
    public void addNewTodoInfo(ikw ikwVar, IBaseResponseCallback iBaseResponseCallback) {
        czm.c(ikwVar, iBaseResponseCallback);
    }

    @Override // com.huawei.health.todo.api.TodoDataApi
    public Class<?> getTodoJsClass() {
        return TodoJsApi.class;
    }

    @Override // com.huawei.health.todo.api.TodoDataApi
    public void refreshTodoList(IBaseResponseCallback iBaseResponseCallback) {
        czq.b().b(iBaseResponseCallback);
    }

    @Override // com.huawei.health.todo.api.TodoDataApi
    public void hideOrShowTodoFloatView(Activity activity, boolean z) {
        czq.b().d(activity, z);
    }

    @Override // com.huawei.health.todo.api.TodoDataApi
    public void removeTodoFloatView() {
        czq.b().d();
    }

    @Override // com.huawei.health.todo.api.TodoDataApi
    public boolean isShowTodo() {
        return czv.c(BaseApplication.b());
    }

    @Override // com.huawei.health.todo.api.TodoDataApi
    public boolean isMainSwitchChecked() {
        return czv.b(BaseApplication.b());
    }
}
