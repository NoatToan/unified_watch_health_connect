package com.xiaomi.fitness.baseui.utils;

import android.text.Spanned;
import android.widget.EditText;
import com.xiaomi.fitness.baseui.utils.InputFilter;
import com.xiaomi.fitness.common.utils.ToastUtil;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\"\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0018\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/baseui/utils/InputFilter;", "", "<init>", "()V", "Charset_1_3", "Ljava/nio/charset/Charset;", "kotlin.jvm.PlatformType", "Ljava/nio/charset/Charset;", "Charset_1_2", "addFilter", "", "editText", "Landroid/widget/EditText;", "filter", "Landroid/text/InputFilter;", "lengthFilter", "maxLen", "", "lengthFilter_2", "notifyText", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputFilter.kt\ncom/xiaomi/fitness/baseui/utils/InputFilter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,57:1\n13467#2,3:58\n*S KotlinDebug\n*F\n+ 1 InputFilter.kt\ncom/xiaomi/fitness/baseui/utils/InputFilter\n*L\n20#1:58,3\n*E\n"})
public final class InputFilter {

    @NotNull
    public static final InputFilter INSTANCE = new InputFilter();
    private static final Charset Charset_1_3 = StandardCharsets.UTF_8;
    private static final Charset Charset_1_2 = Charset.forName("GB2312");

    private InputFilter() {
    }

    private final void addFilter(EditText editText, android.text.InputFilter filter) {
        android.text.InputFilter[] inputFilterArr = new android.text.InputFilter[editText.getFilters().length + 1];
        android.text.InputFilter[] filters = editText.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
        int length = filters.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            android.text.InputFilter inputFilter = filters[i];
            int i3 = i2 + 1;
            if (inputFilter != null) {
                inputFilterArr[i2] = inputFilter;
            }
            i++;
            i2 = i3;
        }
        inputFilterArr[editText.getFilters().length] = filter;
        editText.setFilters(inputFilterArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence lengthFilter$lambda$1(EditText editText, int i, CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        Intrinsics.checkNotNullParameter(editText, "$editText");
        String string = editText.getText().toString();
        Charset Charset_1_4 = Charset_1_3;
        Intrinsics.checkNotNullExpressionValue(Charset_1_4, "Charset_1_3");
        byte[] bytes = string.getBytes(Charset_1_4);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String string2 = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(Charset_1_4, "Charset_1_3");
        byte[] bytes2 = string2.getBytes(Charset_1_4);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        if (bytes.length + bytes2.length > i) {
            return "";
        }
        return null;
    }

    public static /* synthetic */ void lengthFilter_2$default(InputFilter inputFilter, EditText editText, int i, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        inputFilter.lengthFilter_2(editText, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence lengthFilter_2$lambda$2(EditText editText, int i, String str, CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        Intrinsics.checkNotNullParameter(editText, "$editText");
        String string = editText.getText().toString();
        Charset Charset_1_4 = Charset_1_2;
        Intrinsics.checkNotNullExpressionValue(Charset_1_4, "Charset_1_2");
        byte[] bytes = string.getBytes(Charset_1_4);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String string2 = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(Charset_1_4, "Charset_1_2");
        byte[] bytes2 = string2.getBytes(Charset_1_4);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        if (bytes.length + bytes2.length <= i) {
            return null;
        }
        if (str == null || str.length() == 0) {
            return "";
        }
        ToastUtil.showToast(str);
        return "";
    }

    public final void lengthFilter(@NotNull final EditText editText, final int maxLen) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        addFilter(editText, new android.text.InputFilter() { // from class: wad
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return InputFilter.lengthFilter$lambda$1(editText, maxLen, charSequence, i, i2, spanned, i3, i4);
            }
        });
    }

    public final void lengthFilter_2(@NotNull final EditText editText, final int maxLen, @Nullable final String notifyText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        addFilter(editText, new android.text.InputFilter() { // from class: xad
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return InputFilter.lengthFilter_2$lambda$2(editText, maxLen, notifyText, charSequence, i, i2, spanned, i3, i4);
            }
        });
    }
}
