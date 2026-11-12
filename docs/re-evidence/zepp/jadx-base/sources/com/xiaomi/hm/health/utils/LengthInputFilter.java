package com.xiaomi.hm.health.utils;

import android.text.InputFilter;
import android.text.Spanned;
import com.baidu.ocr.sdk.utils.LogUtil;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/utils/LengthInputFilter;", "Landroid/text/InputFilter;", "", "source", "", "start", "end", "Landroid/text/Spanned;", "dest", "dstart", "dend", "filter", "a", LogUtil.I, "maxBytes", "Ljava/nio/charset/Charset;", "b", "Ljava/nio/charset/Charset;", "charset", "<init>", "(ILjava/nio/charset/Charset;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class LengthInputFilter implements InputFilter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int maxBytes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Charset charset;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "text", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<String, Integer> {
        public a() {
            super(1);
        }

        public final int a(@NotNull String str) {
            return str.getBytes(LengthInputFilter.this.charset).length;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(String str) {
            return Integer.valueOf(a(str));
        }
    }

    public LengthInputFilter(int i, @NotNull Charset charset) {
        this.maxBytes = i;
        this.charset = charset;
    }

    @Override // android.text.InputFilter
    @Nullable
    public CharSequence filter(@NotNull CharSequence source, int start, int end, @NotNull Spanned dest, int dstart, int dend) {
        int iIntValue;
        a aVar = new a();
        if (dend == dstart) {
            iIntValue = 0;
        } else {
            String string = dest.toString();
            Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
            iIntValue = aVar.invoke(string.substring(dstart, dend)).intValue();
        }
        int iIntValue2 = this.maxBytes - (aVar.invoke(dest.toString()).intValue() - iIntValue);
        if (iIntValue2 <= 0) {
            return "";
        }
        if (iIntValue2 >= aVar.invoke(source.subSequence(start, end).toString()).intValue()) {
            return null;
        }
        int i = end - 1;
        if (start > i) {
            return "";
        }
        while (true) {
            int i2 = i - 1;
            if (aVar.invoke(source.subSequence(start, i).toString()).intValue() <= iIntValue2) {
                return source.subSequence(start, i).toString();
            }
            if (i == start) {
                return "";
            }
            i = i2;
        }
    }

    public /* synthetic */ LengthInputFilter(int i, Charset charset, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? Charsets.UTF_8 : charset);
    }
}
