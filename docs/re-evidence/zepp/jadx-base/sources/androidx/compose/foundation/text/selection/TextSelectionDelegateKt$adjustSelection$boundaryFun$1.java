package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
public /* synthetic */ class TextSelectionDelegateKt$adjustSelection$boundaryFun$1 extends FunctionReferenceImpl implements Function1<Integer, TextRange> {
    public TextSelectionDelegateKt$adjustSelection$boundaryFun$1(Object obj) {
        super(1, obj, TextLayoutResult.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ TextRange invoke(Integer num) {
        return TextRange.m2712boximpl(m551invokejx7JFs(num.intValue()));
    }

    /* JADX INFO: renamed from: invoke--jx7JFs, reason: not valid java name */
    public final long m551invokejx7JFs(int i) {
        return ((TextLayoutResult) this.receiver).m2709getWordBoundaryjx7JFs(i);
    }
}
