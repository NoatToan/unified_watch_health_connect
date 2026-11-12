package com.xiaomi.hm.health.device.deviceproperty;

import com.xiaomi.hm.health.bt.profile.feature.Feature;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\"\u0016\u0010\u0005\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0007\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "", "toPropertyString", "a", "Ljava/lang/String;", "KEY_FEATURE", "b", "TAG", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class HMDevicePropertyKt {

    @NotNull
    private static final String a = "feature";

    @NotNull
    private static final String b = "HMDeviceProperty";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Byte, CharSequence> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @NotNull
        public final CharSequence a(byte b) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return a(b.byteValue());
        }
    }

    @NotNull
    public static final String toPropertyString(@NotNull Feature feature) {
        if (feature.getAllDatas() != null) {
            return feature.getAllDatas().length == 0 ? "" : ArraysKt___ArraysKt.joinToString$default(feature.getAllDatas(), (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) a.a, 30, (Object) null);
        }
        return "";
    }
}
