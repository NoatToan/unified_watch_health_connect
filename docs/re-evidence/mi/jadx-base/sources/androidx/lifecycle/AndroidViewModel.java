package androidx.lifecycle;

import android.app.Application;
import defpackage.dvq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/lifecycle/AndroidViewModel;", "Ldvq;", "Landroid/app/Application;", "T", "getApplication", "()Landroid/app/Application;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
public class AndroidViewModel extends dvq {

    @NotNull
    private final Application application;

    public AndroidViewModel(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
    }

    @NotNull
    public <T extends Application> T getApplication() {
        T t = (T) this.application;
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t;
    }
}
