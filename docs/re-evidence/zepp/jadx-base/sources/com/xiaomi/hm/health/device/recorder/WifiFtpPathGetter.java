package com.xiaomi.hm.health.device.recorder;

import androidx.annotation.WorkerThread;
import com.huami.bluetooth.profile.channel.module.APReason;
import com.huami.moving.ui.utils.SportAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0003J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001d\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR*\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/recorder/WifiFtpPathGetter;", "", "", "c", "b", "a", "Lcom/huami/bluetooth/profile/channel/module/APReason;", "apReason", "getPathSync", "getPath", "(Lcom/huami/bluetooth/profile/channel/module/APReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "TAG", "", "Lkotlin/reflect/KFunction0;", "Ljava/util/Map;", SportAnalytics.ParamValue.MapButtonType.MAP, "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WifiFtpPathGetter {

    @NotNull
    public static final WifiFtpPathGetter INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "WifiFtpPathGetter";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Map<APReason, KFunction<String>> map;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<String> {
        public a(WifiFtpPathGetter wifiFtpPathGetter) {
            super(0, wifiFtpPathGetter, WifiFtpPathGetter.class, "getRecordPath", "getRecordPath()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ((WifiFtpPathGetter) this.receiver).c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function0<String> {
        public b(WifiFtpPathGetter wifiFtpPathGetter) {
            super(0, wifiFtpPathGetter, WifiFtpPathGetter.class, "getMusicPath", "getMusicPath()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ((WifiFtpPathGetter) this.receiver).b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0<String> {
        public c(WifiFtpPathGetter wifiFtpPathGetter) {
            super(0, wifiFtpPathGetter, WifiFtpPathGetter.class, "getModemLogPath", "getModemLogPath()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ((WifiFtpPathGetter) this.receiver).a();
        }
    }

    static {
        WifiFtpPathGetter wifiFtpPathGetter = new WifiFtpPathGetter();
        INSTANCE = wifiFtpPathGetter;
        map = r.mapOf(TuplesKt.to(APReason.Record, new a(wifiFtpPathGetter)), TuplesKt.to(APReason.Music, new b(wifiFtpPathGetter)), TuplesKt.to(APReason.ModemLog, new c(wifiFtpPathGetter)));
    }

    private WifiFtpPathGetter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final String a() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final String b() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final String c() {
        return "/mnt/data/Downloads/VoiceMemo/list";
    }

    @Nullable
    public final Object getPath(@NotNull APReason aPReason, @NotNull Continuation<? super String> continuation) {
        return getPathSync(aPReason);
    }

    @WorkerThread
    @Nullable
    public final String getPathSync(@NotNull APReason apReason) {
        KFunction<String> kFunction = map.get(apReason);
        if (kFunction == null) {
            return null;
        }
        return (String) ((Function0) kFunction).invoke();
    }
}
