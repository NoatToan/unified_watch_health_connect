package yy2;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.w;
import p13.x;
import zk.d;
import zk.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lyy2/b;", "", "<init>", "()V", "a", "b", "analytics-accessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f200198a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f200199b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyy2/b$a;", "", "", "eventName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "analytics-accessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum a {
        LargeTextEnabled("LargeTextEnabled"),
        LargeTextDisabled("LargeTextDisabled"),
        VoiceOverEnabled("VoiceOverEnabled"),
        VoiceOverDisabled("VoiceOverDisabled"),
        HighContrastEnabled("HighContrastEnabled"),
        HighContrastDisabled("HighContrastDisabled"),
        BoldTextEnabled("BoldTextEnabled"),
        BoldTextDisabled("BoldTextDisabled"),
        ReduceMotionEnabled("ReduceMotionEnabled"),
        ReduceMotionDisabled("ReduceMotionDisabled");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f200211a;

        a(String str) {
            this.f200211a = str;
        }
    }

    private b() {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    public static List a(Context context) {
        String str;
        Object bVar;
        Object systemService = context.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            str = a.VoiceOverDisabled.f200211a;
        } else {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
            enabledAccessibilityServiceList.getClass();
            if (enabledAccessibilityServiceList.isEmpty()) {
                str = a.VoiceOverDisabled.f200211a;
            } else {
                str = a.VoiceOverEnabled.f200211a;
            }
        }
        zk.a aVar = new zk.a(str, j0.f134944a, false, 0L, 12, null);
        try {
            int i14 = q.f128596b;
            Object systemService2 = context.getSystemService("accessibility");
            AccessibilityManager accessibilityManager2 = systemService2 instanceof AccessibilityManager ? (AccessibilityManager) systemService2 : null;
            if (accessibilityManager2 != null) {
                Object objInvoke = accessibilityManager2.getClass().getMethod("isHighTextContrastEnabled", null).invoke(accessibilityManager2, null);
                if (objInvoke instanceof Boolean) {
                    bVar = (Boolean) objInvoke;
                } else {
                    bVar = null;
                }
            } else {
                bVar = null;
            }
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            bVar = new q.b(th3);
        }
        Throwable thB = q.b(bVar);
        if (thB != null) {
            thB.printStackTrace();
        }
        Boolean bool = (Boolean) (bVar instanceof q.b ? null : bVar);
        String str2 = bool != null ? bool.booleanValue() : false ? a.HighContrastEnabled.f200211a : a.HighContrastDisabled.f200211a;
        j0 j0Var = j0.f134944a;
        zk.a aVar2 = new zk.a(str2, j0Var, false, 0L, 12, null);
        float f14 = context.getResources().getConfiguration().fontScale;
        EnumC3747b.f200212b.getClass();
        float f15 = 1.0f;
        zk.a aVar3 = new zk.a(f14 > 1.0f ? a.LargeTextEnabled.f200211a : a.LargeTextDisabled.f200211a, w.c(new e("LargeTextSize", EnumC3747b.a.a(f14).f200223a)), false, 0L, 12, null);
        zk.a aVar4 = new zk.a((Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment <= 0) ? a.BoldTextDisabled.f200211a : a.BoldTextEnabled.f200211a, j0Var, false, 0L, 12, null);
        try {
            f15 = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale");
        } catch (Exception unused) {
        }
        return x.k(aVar, aVar2, aVar3, aVar4, new zk.a(f15 == 0.0f ? a.ReduceMotionEnabled.f200211a : a.ReduceMotionDisabled.f200211a, j0.f134944a, false, 0L, 12, null));
    }

    /* JADX INFO: renamed from: yy2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lyy2/b$b;", "", "", "description", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "analytics-accessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum EnumC3747b {
        S("S"),
        M("M"),
        L("L"),
        XL("XL"),
        XXL("2XL"),
        XXXL("3XL"),
        AM("AM"),
        AL("AL"),
        Unknown("Unknown");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f200212b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f200223a;

        EnumC3747b(String str) {
            this.f200223a = str;
        }

        /* JADX INFO: renamed from: yy2.b$b$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyy2/b$b$a;", "", "<init>", "()V", "analytics-accessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(j jVar) {
                this();
            }

            public static EnumC3747b a(float f14) {
                if (f14 < 0.0f) {
                    return EnumC3747b.Unknown;
                }
                if (f14 < 0.9f) {
                    return EnumC3747b.S;
                }
                if (f14 < 1.0f) {
                    return EnumC3747b.M;
                }
                if (f14 < 1.1f) {
                    return EnumC3747b.L;
                }
                if (f14 < 1.3f) {
                    return EnumC3747b.XL;
                }
                if (f14 < 1.5f) {
                    return EnumC3747b.XXL;
                }
                if (f14 < 1.7f) {
                    return EnumC3747b.XXXL;
                }
                if (f14 < 2.0f) {
                    return EnumC3747b.AM;
                }
                return f14 > 2.0f ? EnumC3747b.AL : EnumC3747b.L;
            }

            private a() {
            }
        }
    }
}
