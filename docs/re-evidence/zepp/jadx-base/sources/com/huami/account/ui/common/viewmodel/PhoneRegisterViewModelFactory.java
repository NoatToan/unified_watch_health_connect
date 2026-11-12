package com.huami.account.ui.common.viewmodel;

import android.app.Application;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.account.ui.common.repo.PhoneAccountRepository;
import com.huami.account.ui.register.viewmodel.PhoneRegisterViewModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/account/ui/common/viewmodel/PhoneRegisterViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Landroid/app/Application;", "a", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "<init>", "(Landroid/app/Application;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class PhoneRegisterViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Application application;

    public PhoneRegisterViewModelFactory(@NotNull Application application) {
        this.application = application;
    }

    @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        return new PhoneRegisterViewModel(this.application, new PhoneAccountRepository());
    }

    @NotNull
    public final Application getApplication() {
        return this.application;
    }
}
