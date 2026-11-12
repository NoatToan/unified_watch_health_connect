package com.huami.watch.companion.watchface;

import android.app.Application;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.watchface.XiHuWatchFaceDiyViewModule;
import com.huami.watch.companion.watchface.bean.WatchSkinBean;
import com.huami.watch.companion.watchface.manager.XiHuDiyWatchFaceManager;
import com.huami.watch.util.Rx;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\tR\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR)\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/huami/watch/companion/watchface/XiHuWatchFaceDiyViewModule;", "Landroidx/lifecycle/AndroidViewModel;", "", "version1", "version2", "", "c", "", "getCloudDiyWatchSkin", "", "isSupportDiy", "Landroid/app/Application;", "a", "Landroid/app/Application;", "getApp", "()Landroid/app/Application;", "app", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/huami/watch/companion/watchface/bean/WatchSkinBean;", "b", "Lkotlin/Lazy;", "getDiyWatchSkinLiveData", "()Landroidx/lifecycle/MutableLiveData;", "diyWatchSkinLiveData", "Landroidx/lifecycle/MutableLiveData;", "getShowDiyTab", "showDiyTab", "<init>", "(Landroid/app/Application;)V", "Companion", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class XiHuWatchFaceDiyViewModule extends AndroidViewModel {

    @NotNull
    public static final String XIHUD_SUPPORT_DIY_WATCH_FACE_MIN_VERSION = "1.3.20.0";

    @NotNull
    public static final String XIHUEA_SUPPORT_DIY_WATCH_FACE_MIN_VERSION = "1.2.8.0";

    @NotNull
    public static final String XIHUE_SUPPORT_DIY_WATCH_FACE_MIN_VERSION = "1.1.20.0";

    @NotNull
    public static final String XIHU_SUPPORT_DIY_WATCH_FACE_MIN_VERSION = "1.0.20.0";

    @NotNull
    private static final String d = ".";

    @NotNull
    private static final String e = "[a-zA-Z]";

    @NotNull
    private static final String f = "-";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Application app;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy diyWatchSkinLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> showDiyTab;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "Lcom/huami/watch/companion/watchface/bean/WatchSkinBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MutableLiveData<WatchSkinBean[]>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<WatchSkinBean[]> invoke() {
            return new MutableLiveData<>();
        }
    }

    public XiHuWatchFaceDiyViewModule(@NotNull Application application) {
        super(application);
        this.app = application;
        this.diyWatchSkinLiveData = LazyKt__LazyJVMKt.lazy(a.a);
        this.showDiyTab = new MutableLiveData<>();
    }

    private final int c(String version1, String version2) {
        Regex regex = new Regex(e);
        String strReplace$default = m.replace$default(regex.replace(version1, ""), "-", "", false, 4, (Object) null);
        String strReplace$default2 = m.replace$default(regex.replace(version2, ""), "-", "", false, 4, (Object) null);
        try {
            if (Intrinsics.areEqual(strReplace$default, strReplace$default2)) {
                return 0;
            }
            Object[] array = StringsKt__StringsKt.split$default((CharSequence) strReplace$default, new String[]{d}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            Object[] array2 = StringsKt__StringsKt.split$default((CharSequence) strReplace$default2, new String[]{d}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr2 = (String[]) array2;
            int iMin = Math.min(strArr.length, strArr2.length);
            int i = 0;
            int i2 = 0;
            while (i < iMin) {
                i2 = Integer.parseInt(strArr[i]) - Integer.parseInt(strArr2[i]);
                if (i2 != 0) {
                    break;
                }
                i++;
            }
            if (i2 != 0) {
                return i2 > 0 ? 1 : -1;
            }
            int length = strArr.length;
            if (i < length) {
                int i3 = i;
                while (true) {
                    int i4 = i3 + 1;
                    if (Integer.parseInt(strArr[i3]) > 0) {
                        return 1;
                    }
                    if (i4 >= length) {
                        break;
                    }
                    i3 = i4;
                }
            }
            int length2 = strArr2.length;
            if (i >= length2) {
                return 0;
            }
            while (true) {
                int i5 = i + 1;
                if (Integer.parseInt(strArr2[i]) > 0) {
                    return -1;
                }
                if (i5 >= length2) {
                    return 0;
                }
                i = i5;
            }
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(XiHuWatchFaceDiyViewModule xiHuWatchFaceDiyViewModule, ObservableEmitter observableEmitter) {
        WatchSkinBean[] cloudDiyWatchSkin = new XiHuDiyWatchFaceManager(xiHuWatchFaceDiyViewModule.getApp()).getCloudDiyWatchSkin();
        if (cloudDiyWatchSkin == null) {
            return;
        }
        observableEmitter.onNext(cloudDiyWatchSkin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(XiHuWatchFaceDiyViewModule xiHuWatchFaceDiyViewModule, WatchSkinBean[] watchSkinBeanArr) {
        xiHuWatchFaceDiyViewModule.getShowDiyTab().postValue(Boolean.valueOf((watchSkinBeanArr == null ? 0 : watchSkinBeanArr.length) > 0));
        xiHuWatchFaceDiyViewModule.getDiyWatchSkinLiveData().postValue(watchSkinBeanArr);
    }

    @NotNull
    public final Application getApp() {
        return this.app;
    }

    public final void getCloudDiyWatchSkin() {
        Rx.io(new ObservableOnSubscribe() { // from class: sx8
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                XiHuWatchFaceDiyViewModule.e(this.a, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: tx8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                XiHuWatchFaceDiyViewModule.f(this.a, (WatchSkinBean[]) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<WatchSkinBean[]> getDiyWatchSkinLiveData() {
        return (MutableLiveData) this.diyWatchSkinLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowDiyTab() {
        return this.showDiyTab;
    }

    public final boolean isSupportDiy() {
        Device currentDevice = DeviceManager.getManager(this.app).getCurrentDevice();
        String romVersion = DeviceUtil.getRomVersion(currentDevice);
        if (DeviceSource.isModelXihuDisney(currentDevice)) {
            if (c(romVersion, XIHUD_SUPPORT_DIY_WATCH_FACE_MIN_VERSION) >= 0) {
                return true;
            }
        } else if (DeviceSource.isModelXihu(currentDevice)) {
            if (c(romVersion, XIHU_SUPPORT_DIY_WATCH_FACE_MIN_VERSION) >= 0) {
                return true;
            }
        } else if (DeviceSource.isModelXihuE(currentDevice)) {
            if (c(romVersion, XIHUE_SUPPORT_DIY_WATCH_FACE_MIN_VERSION) >= 0) {
                return true;
            }
        } else if (DeviceSource.isModelXihuEA(currentDevice) && c(romVersion, XIHUEA_SUPPORT_DIY_WATCH_FACE_MIN_VERSION) >= 0) {
            return true;
        }
        return false;
    }
}
