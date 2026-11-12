package com.huami.xiaopeng.repo.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import com.huami.arch.core.Fail;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.Loading;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.huami.xiaopeng.repo.viewapi.XpLoadingWidgetApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aV\u0010\f\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\n0\t¨\u0006\r"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "Lcom/huami/arch/core/State;", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "Lcom/huami/xiaopeng/repo/viewapi/XpLoadingWidgetApi;", "loadingView", "", "message", "Lkotlin/Function1;", "", "action", "observeOnSuccessXp", "xiaopeng-repo_release"}, k = 2, mv = {1, 5, 1})
public final class BaseViewModelKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/arch/core/State;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a<T> extends Lambda implements Function1<State<? extends T>, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ XpLoadingWidgetApi b;
        public final /* synthetic */ Function1<State<? extends T>, Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, XpLoadingWidgetApi xpLoadingWidgetApi, Function1<? super State<? extends T>, Unit> function1) {
            super(1);
            this.a = str;
            this.b = xpLoadingWidgetApi;
            this.c = function1;
        }

        public final void a(@NotNull State<? extends T> state) {
            XpLoadingWidgetApi xpLoadingWidgetApi;
            if (!(state instanceof Loading)) {
                if (state instanceof Success) {
                    XpLoadingWidgetApi xpLoadingWidgetApi2 = this.b;
                    if (xpLoadingWidgetApi2 != null) {
                        xpLoadingWidgetApi2.dismiss();
                    }
                    this.c.invoke(state);
                    return;
                }
                if (!(state instanceof Fail) || (xpLoadingWidgetApi = this.b) == null) {
                    return;
                }
                xpLoadingWidgetApi.showError(((Fail) state).getError());
                return;
            }
            String str = this.a;
            if (str == null || str.length() == 0) {
                XpLoadingWidgetApi xpLoadingWidgetApi3 = this.b;
                if (xpLoadingWidgetApi3 == null) {
                    return;
                }
                xpLoadingWidgetApi3.showLoading();
                return;
            }
            XpLoadingWidgetApi xpLoadingWidgetApi4 = this.b;
            if (xpLoadingWidgetApi4 == null) {
                return;
            }
            xpLoadingWidgetApi4.showLoading(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a((State) obj);
            return Unit.INSTANCE;
        }
    }

    public static final <T> void observeOnSuccessXp(@NotNull LiveData<State<T>> liveData, @NotNull LifecycleOwner lifecycleOwner, @Nullable XpLoadingWidgetApi xpLoadingWidgetApi, @Nullable String str, @NotNull Function1<? super State<? extends T>, Unit> function1) {
        LiveDataExtensionKt.observeStateNotNull(liveData, lifecycleOwner, new a(str, xpLoadingWidgetApi, function1));
    }

    public static /* synthetic */ void observeOnSuccessXp$default(LiveData liveData, LifecycleOwner lifecycleOwner, XpLoadingWidgetApi xpLoadingWidgetApi, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            xpLoadingWidgetApi = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        observeOnSuccessXp(liveData, lifecycleOwner, xpLoadingWidgetApi, str, function1);
    }
}
