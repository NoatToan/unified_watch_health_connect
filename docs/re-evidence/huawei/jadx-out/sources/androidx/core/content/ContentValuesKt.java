package androidx.core.content;

import android.content.ContentValues;
import defpackage.yyu;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"contentValuesOf", "Landroid/content/ContentValues;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/content/ContentValues;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ContentValuesKt {
    public static final ContentValues contentValuesOf(yyu<String, ? extends Object>... yyuVarArr) {
        ContentValues contentValues = new ContentValues(yyuVarArr.length);
        for (yyu<String, ? extends Object> yyuVar : yyuVarArr) {
            String strA = yyuVar.a();
            Object objE = yyuVar.e();
            if (objE == null) {
                contentValues.putNull(strA);
            } else if (objE instanceof String) {
                contentValues.put(strA, (String) objE);
            } else if (objE instanceof Integer) {
                contentValues.put(strA, (Integer) objE);
            } else if (objE instanceof Long) {
                contentValues.put(strA, (Long) objE);
            } else if (objE instanceof Boolean) {
                contentValues.put(strA, (Boolean) objE);
            } else if (objE instanceof Float) {
                contentValues.put(strA, (Float) objE);
            } else if (objE instanceof Double) {
                contentValues.put(strA, (Double) objE);
            } else if (objE instanceof byte[]) {
                contentValues.put(strA, (byte[]) objE);
            } else if (objE instanceof Byte) {
                contentValues.put(strA, (Byte) objE);
            } else {
                if (!(objE instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + objE.getClass().getCanonicalName() + " for key \"" + strA + '\"');
                }
                contentValues.put(strA, (Short) objE);
            }
        }
        return contentValues;
    }
}
