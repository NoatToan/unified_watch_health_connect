package com.huami.bodymeasurements.common.business.add.view;

import android.text.Editable;
import android.text.TextWatcher;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001Bt\u0012%\u0010\u0016\u001a!\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00040\u000ej\u0002`\u0013\u0012:\u0010\u001c\u001a6\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00040\u0017j\u0002`\u0019\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J*\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016R5\u0010\u0016\u001a!\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00040\u000ej\u0002`\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015RJ\u0010\u001c\u001a6\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00040\u0017j\u0002`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/bodymeasurements/common/business/add/view/DigitsTextWatcher;", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", SOAP.XMLNS, "", "afterTextChanged", "", "", "start", "count", b.d0, "beforeTextChanged", b.c0, "onTextChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "text", "Lcom/huami/bodymeasurements/common/business/add/view/DigitAfterTextChanged;", "a", "Lkotlin/jvm/functions/Function1;", "digitAfterTextChanged", "Lkotlin/Function2;", "selection", "Lcom/huami/bodymeasurements/common/business/add/view/DigitOnTextChanged;", "b", "Lkotlin/jvm/functions/Function2;", "digitOnTextChanged", "c", LogUtil.I, "digits", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "common_release"}, k = 1, mv = {1, 5, 1})
public final class DigitsTextWatcher implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function1<String, Unit> digitAfterTextChanged;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function2<String, Integer, Unit> digitOnTextChanged;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int digits;

    /* JADX WARN: Multi-variable type inference failed */
    public DigitsTextWatcher(@NotNull Function1<? super String, Unit> function1, @NotNull Function2<? super String, ? super Integer, Unit> function2, int i) {
        this.digitAfterTextChanged = function1;
        this.digitOnTextChanged = function2;
        this.digits = i;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable s) {
        this.digitAfterTextChanged.invoke(String.valueOf(s));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence s, int start, int before, int count) {
        String strValueOf = String.valueOf(s);
        if (StringsKt__StringsKt.contains$default((CharSequence) strValueOf, (CharSequence) ".", false, 2, (Object) null) && (strValueOf.length() - 1) - StringsKt__StringsKt.indexOf$default((CharSequence) strValueOf, ".", 0, false, 6, (Object) null) > this.digits) {
            strValueOf = strValueOf.subSequence(0, StringsKt__StringsKt.indexOf$default((CharSequence) strValueOf, ".", 0, false, 6, (Object) null) + this.digits + 1).toString();
            this.digitOnTextChanged.invoke(strValueOf, Integer.valueOf(strValueOf.length()));
        }
        String string = StringsKt__StringsKt.trim(strValueOf).toString();
        Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
        if (Intrinsics.areEqual(string.substring(0), ".")) {
            strValueOf = Intrinsics.stringPlus("0", strValueOf);
            this.digitOnTextChanged.invoke(strValueOf, 2);
        }
        if (m.startsWith$default(strValueOf, "0", false, 2, null)) {
            Objects.requireNonNull(strValueOf, "null cannot be cast to non-null type kotlin.CharSequence");
            if (StringsKt__StringsKt.trim(strValueOf).toString().length() <= 1 || Intrinsics.areEqual(strValueOf.substring(1, 2), ".")) {
                return;
            }
            this.digitOnTextChanged.invoke(strValueOf.subSequence(0, 1).toString(), 1);
        }
    }

    public /* synthetic */ DigitsTextWatcher(Function1 function1, Function2 function2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function2, (i2 & 4) != 0 ? 1 : i);
    }
}
