package cs1;

import android.text.Editable;
import d53.w;
import java.util.ArrayList;
import java.util.Collections;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcs1/g;", "", "<init>", "()V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {
    static {
        new a(null);
    }

    public static int a(Editable editable, int i14) {
        cs1.a[] aVarArr = (cs1.a[]) editable.getSpans(0, i14, cs1.a.class);
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (cs1.a aVar : aVarArr) {
            arrayList.add(Integer.valueOf(editable.getSpanEnd(aVar)));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) obj).intValue() <= i14) {
                arrayList2.add(obj);
            }
        }
        String property = System.getProperty("line.separator");
        if (property == null) {
            property = "\n";
        }
        Object objMax = Collections.max(h0.D0(arrayList2, Integer.valueOf(w.L(0, 6, editable.subSequence(0, i14), property) + 1)));
        objMax.getClass();
        int iIntValue = ((Number) objMax).intValue();
        CharSequence charSequenceSubSequence = editable.subSequence(iIntValue, i14);
        int length = charSequenceSubSequence.length() - 1;
        if (length < 0) {
            length = -1;
            break;
        }
        while (true) {
            int i15 = length - 1;
            char cCharAt = charSequenceSubSequence.charAt(length);
            if (cCharAt == '@' || cCharAt == 65312) {
                break;
            }
            if (i15 < 0) {
                length = -1;
                break;
            }
            length = i15;
        }
        return length == -1 ? i14 : iIntValue + length;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcs1/g$a;", "", "<init>", "()V", "", "TAG_START", "C", "TAG_START_FULL_WIDTH", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
