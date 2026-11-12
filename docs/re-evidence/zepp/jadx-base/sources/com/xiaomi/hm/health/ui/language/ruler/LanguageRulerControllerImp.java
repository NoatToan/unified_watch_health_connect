package com.xiaomi.hm.health.ui.language.ruler;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.profile.page.PageType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.ui.language.ruler.BaseLangRuler;
import com.xiaomi.hm.health.ui.language.ruler.LanguageRulerControllerImp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0018\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001c\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/ui/language/ruler/LanguageRulerControllerImp;", "Lcom/xiaomi/hm/health/ui/language/ruler/LanguageRulerController;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmBaseDevice", "Lcom/xiaomi/hm/health/ui/language/ruler/BaseLangRuler;", "getFitDeviceLanguageRuler", "", "isBind", "", "applyUnilateralLangRuler", "entranceVisible", "", "a", "Ljava/util/List;", "rulers", "Lcom/xiaomi/hm/health/ui/language/ruler/BilateralFollowPhoneLanguageRuler;", "b", "Lkotlin/Lazy;", "c", "()Lcom/xiaomi/hm/health/ui/language/ruler/BilateralFollowPhoneLanguageRuler;", "ruler0", "Lcom/xiaomi/hm/health/ui/language/ruler/KongmingLanguageRuler;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/ui/language/ruler/KongmingLanguageRuler;", "ruler1", "Lcom/xiaomi/hm/health/ui/language/ruler/UnilateralDeviceLanguageRulerImp;", "e", "()Lcom/xiaomi/hm/health/ui/language/ruler/UnilateralDeviceLanguageRulerImp;", "ruler2", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class LanguageRulerControllerImp implements LanguageRulerController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<LanguageRulerControllerImp> e = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) a.a);

    @NotNull
    private static final String f = "LanguageRulerControllerImp";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<BaseLangRuler> rulers;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy ruler0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy ruler1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy ruler2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/ruler/LanguageRulerControllerImp$Companion;", "", "Lcom/xiaomi/hm/health/ui/language/ruler/LanguageRulerController;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/xiaomi/hm/health/ui/language/ruler/LanguageRulerController;", DefaultSettingsSpiCall.n, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), DefaultSettingsSpiCall.n, "getInstance()Lcom/xiaomi/hm/health/ui/language/ruler/LanguageRulerController;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LanguageRulerController getInstance() {
            return (LanguageRulerController) LanguageRulerControllerImp.e.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/ruler/LanguageRulerControllerImp;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LanguageRulerControllerImp> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LanguageRulerControllerImp getA() {
            return new LanguageRulerControllerImp();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ BaseLangRuler b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, BaseLangRuler baseLangRuler) {
            super(0);
            this.a = z;
            this.b = baseLangRuler;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "event " + this.a + ", applyLanguageRuler of ruler:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ BaseLangRuler a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BaseLangRuler baseLangRuler) {
            super(0);
            this.a = baseLangRuler;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "entranceVisible of ruler:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/ruler/BilateralFollowPhoneLanguageRuler;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<BilateralFollowPhoneLanguageRuler> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BilateralFollowPhoneLanguageRuler getA() {
            BilateralFollowPhoneLanguageRuler bilateralFollowPhoneLanguageRuler = new BilateralFollowPhoneLanguageRuler();
            bilateralFollowPhoneLanguageRuler.setPriority(255);
            return bilateralFollowPhoneLanguageRuler;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/ruler/KongmingLanguageRuler;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<KongmingLanguageRuler> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KongmingLanguageRuler getA() {
            KongmingLanguageRuler kongmingLanguageRuler = new KongmingLanguageRuler();
            kongmingLanguageRuler.setPriority(254);
            return kongmingLanguageRuler;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/ruler/UnilateralDeviceLanguageRulerImp;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<DeviceLanguageRulerImp> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeviceLanguageRulerImp getA() {
            DeviceLanguageRulerImp deviceLanguageRulerImp = new DeviceLanguageRulerImp();
            deviceLanguageRulerImp.setPriority(PageType.PAGE_SHORTCUT);
            return deviceLanguageRulerImp;
        }
    }

    public LanguageRulerControllerImp() {
        ArrayList arrayList = new ArrayList();
        this.rulers = arrayList;
        this.ruler0 = LazyKt__LazyJVMKt.lazy(d.a);
        this.ruler1 = LazyKt__LazyJVMKt.lazy(e.a);
        this.ruler2 = LazyKt__LazyJVMKt.lazy(f.a);
        arrayList.add(c());
        arrayList.add(d());
        arrayList.add(e());
        CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: sl4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return LanguageRulerControllerImp.b((BaseLangRuler) obj, (BaseLangRuler) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(BaseLangRuler baseLangRuler, BaseLangRuler baseLangRuler2) {
        return baseLangRuler.getPriorityCache() - baseLangRuler2.getPriorityCache();
    }

    private final BilateralFollowPhoneLanguageRuler c() {
        return (BilateralFollowPhoneLanguageRuler) this.ruler0.getValue();
    }

    private final KongmingLanguageRuler d() {
        return (KongmingLanguageRuler) this.ruler1.getValue();
    }

    private final DeviceLanguageRulerImp e() {
        return (DeviceLanguageRulerImp) this.ruler2.getValue();
    }

    @Override // com.xiaomi.hm.health.ui.language.ruler.LanguageRulerController
    public void applyUnilateralLangRuler(boolean isBind, @Nullable HMBaseDevice hmBaseDevice) {
        BaseLangRuler fitDeviceLanguageRuler = getFitDeviceLanguageRuler(hmBaseDevice);
        if (fitDeviceLanguageRuler == null) {
            return;
        }
        if (!(fitDeviceLanguageRuler instanceof UnilateralLanguageRuler)) {
            fitDeviceLanguageRuler = null;
        }
        if (fitDeviceLanguageRuler == null) {
            return;
        }
        UnilateralLanguageRuler unilateralLanguageRuler = (UnilateralLanguageRuler) fitDeviceLanguageRuler;
        HMLog.info(f, new b(isBind, fitDeviceLanguageRuler));
        HMLanguage rulerLanguage = unilateralLanguageRuler.getRulerLanguage();
        if (rulerLanguage != null) {
            unilateralLanguageRuler.setBindFlag(isBind);
            unilateralLanguageRuler.setLanguage(rulerLanguage);
        }
    }

    @Override // com.xiaomi.hm.health.ui.language.ruler.LanguageRulerController
    public boolean entranceVisible() {
        BaseLangRuler fitDeviceLanguageRuler = getFitDeviceLanguageRuler(HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI));
        if (fitDeviceLanguageRuler == null) {
            return false;
        }
        HMLog.info(f, new c(fitDeviceLanguageRuler));
        return fitDeviceLanguageRuler.entranceVisible();
    }

    @Override // com.xiaomi.hm.health.ui.language.ruler.LanguageRulerController
    @Nullable
    public BaseLangRuler getFitDeviceLanguageRuler(@Nullable HMBaseDevice hmBaseDevice) {
        Object next;
        Iterator<T> it2 = this.rulers.iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (((BaseLangRuler) next).isFitCurrentDeviceRuler(hmBaseDevice)) {
                return (BaseLangRuler) next;
            }
        }
        next = null;
        return (BaseLangRuler) next;
    }
}
