package cs1;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import d53.w;
import e23.l;
import j23.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    public static final Spannable a(ConversationCommentDTO conversationCommentDTO, Context context) {
        String displayName;
        conversationCommentDTO.getClass();
        context.getClass();
        List<mo1.a> list = conversationCommentDTO.f44562q;
        if (list == null || list.isEmpty()) {
            String str = conversationCommentDTO.f44555j;
            if (str == null) {
                str = "";
            }
            return new SpannableString(str);
        }
        List<mo1.a> list2 = conversationCommentDTO.f44562q;
        list2.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (mo1.a aVar : list2) {
            if (aVar.F() && aVar.getUserId() != null && (displayName = aVar.getDisplayName()) != null && !w.J(displayName)) {
                ds1.a aVar2 = new ds1.a(aVar.getUserId(), aVar.getDisplayName(), aVar.getText(), null, null, 24, null);
                SpannableString spannableString = new SpannableString(aVar2.b());
                spannableString.setSpan(new a(context, aVar2), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            } else if (aVar.F()) {
                spannableStringBuilder.append((CharSequence) context.getString(R.string.lbl_anonymous));
            } else {
                spannableStringBuilder.append((CharSequence) aVar.getText());
            }
        }
        return spannableStringBuilder;
    }

    public static final ArrayList b(Spannable spannable) {
        spannable.getClass();
        ArrayList arrayList = new ArrayList();
        int iNextSpanTransition = spannable.nextSpanTransition(0, spannable.length(), a.class);
        int i14 = 0;
        int i15 = 0;
        while (iNextSpanTransition <= spannable.length()) {
            a[] aVarArr = (a[]) spannable.getSpans(i14, iNextSpanTransition, a.class);
            int length = aVarArr.length;
            int i16 = 0;
            while (i16 < length) {
                a aVar = aVarArr[i16];
                int spanStart = spannable.getSpanStart(aVar);
                int spanEnd = spannable.getSpanEnd(aVar);
                if (spanStart > i15) {
                    arrayList.add(new mo1.a(mo1.a.c.RAW, w.a0(spannable, t.o(i15, spanStart)), null, null, 12, null));
                }
                ds1.a aVar2 = aVar.f55456a;
                arrayList.add(new mo1.a(mo1.a.c.TAG_USER, w.a0(spannable, t.o(spanStart, spanEnd)), aVar2.f61091a, aVar2.f61092b));
                i16++;
                i15 = spanEnd;
            }
            if (iNextSpanTransition == spannable.length()) {
                break;
            }
            i14 = iNextSpanTransition;
            iNextSpanTransition = spannable.nextSpanTransition(iNextSpanTransition, spannable.length(), a.class);
        }
        if (i15 != spannable.length()) {
            arrayList.add(new mo1.a(mo1.a.c.RAW, w.a0(spannable, t.o(i15, spannable.length())), null, null, 12, null));
        }
        return arrayList;
    }

    public static final SpannableStringBuilder c(List list, Context context, l lVar) {
        String displayName;
        list.getClass();
        context.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo1.a aVar = (mo1.a) it.next();
            if (aVar.F() && aVar.getUserId() != null && (displayName = aVar.getDisplayName()) != null && !w.J(displayName)) {
                ds1.a aVar2 = new ds1.a(aVar.getUserId(), aVar.getDisplayName(), aVar.getText(), null, null, 24, null);
                SpannableString spannableString = new SpannableString(aVar2.b());
                spannableString.setSpan(new c(context, aVar2, lVar), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            } else if (aVar.F()) {
                spannableStringBuilder.append((CharSequence) context.getString(R.string.lbl_anonymous));
            } else {
                spannableStringBuilder.append((CharSequence) aVar.getText());
            }
        }
        return spannableStringBuilder;
    }
}
