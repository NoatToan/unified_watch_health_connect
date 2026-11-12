package com.xiaomi.fitness.baseui;

import android.os.Bundle;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.common.log.Logger;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u00028\u00008\u0006@\u0006X\u0087.¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/baseui/BaseViewModel;", "M", "Lcom/xiaomi/fitness/baseui/BaseModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "mModel", "getMModel", "()Lcom/xiaomi/fitness/baseui/BaseModel;", "setMModel", "(Lcom/xiaomi/fitness/baseui/BaseModel;)V", "Lcom/xiaomi/fitness/baseui/BaseModel;", "initModel", "", "attach", "savedInstanceState", "Landroid/os/Bundle;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseViewModel<M extends BaseModel> extends AbsViewModel {

    @NotNull
    private final String TAG = "BaseViewModel";
    public M mModel;

    private final void initModel() {
        Class cls = null;
        Type genericSuperclass = null;
        for (Class<?> superclass = getClass(); !(genericSuperclass instanceof ParameterizedType) && superclass != null; superclass = superclass.getSuperclass()) {
            genericSuperclass = superclass.getGenericSuperclass();
        }
        if (genericSuperclass != null) {
            Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            Intrinsics.checkNotNull(type, "null cannot be cast to non-null type java.lang.Class<M of com.xiaomi.fitness.baseui.BaseViewModel>");
            cls = (Class) type;
        }
        Logger.i(getTAG(), "Initialize " + cls);
        if (cls == null || Intrinsics.areEqual(cls, BaseModel.class)) {
            Logger.d(getTAG(), "Do not use Model");
            return;
        }
        try {
            setMModel((BaseModel) cls.newInstance());
        } catch (IllegalAccessException e) {
            Logger.e(getTAG(), "Fail to initialize " + cls + " due to " + e);
        } catch (InstantiationException e2) {
            Logger.e(getTAG(), "Fail to initialize " + cls + " due to " + e2);
        }
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final M getMModel() {
        M m = this.mModel;
        if (m != null) {
            return m;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mModel");
        return null;
    }

    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    public final void setMModel(@NotNull M m) {
        Intrinsics.checkNotNullParameter(m, "<set-?>");
        this.mModel = m;
    }
}
