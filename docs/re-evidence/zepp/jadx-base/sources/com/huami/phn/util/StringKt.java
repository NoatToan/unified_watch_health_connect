package com.huami.phn.util;

import com.google.android.material.timepicker.TimeModel;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0002H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"", "md5", "", "i18n", "", "places", "phn_coach_release"}, k = 2, mv = {1, 5, 1})
public final class StringKt {

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
    public static final String i18n(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }

    public static /* synthetic */ String i18n$default(float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return i18n(f, i);
    }

    @NotNull
    public static final String md5(@NotNull String str) {
        return ArraysKt___ArraysKt.joinToString$default(MessageDigest.getInstance("MD5").digest(str.getBytes(Charsets.UTF_8)), (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) a.a, 30, (Object) null);
    }

    @NotNull
    public static final String i18n(float f, int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), "%." + i + "f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
    }
}
