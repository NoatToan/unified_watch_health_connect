package fo1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 {
    public static final String a(ConversationCommentDTO conversationCommentDTO, Context context, boolean z14) {
        conversationCommentDTO.getClass();
        context.getClass();
        Date date = conversationCommentDTO.f44549d;
        if (date == null || date.getTime() <= 0) {
            return "";
        }
        c22.j0 j0Var = c22.j0.f23099a;
        Long lValueOf = Long.valueOf(conversationCommentDTO.f44549d.getTime());
        j0Var.getClass();
        DateTime dateTimeB = c22.j0.B(lValueOf);
        return dateTimeB != null ? xy2.b.q(context, dateTimeB, z14, 12) : "";
    }

    public static final go1.w b(ConversationCommentDTO conversationCommentDTO, Context context, boolean z14) {
        conversationCommentDTO.getClass();
        context.getClass();
        return new go1.w(2, z14, conversationCommentDTO, null, new go1.w.c(conversationCommentDTO.f44548c, conversationCommentDTO.f44556k, conversationCommentDTO.f44557l, false, null, cs1.h.a(conversationCommentDTO, context), null, null, 216, null), 8, null);
    }

    public static final List c(ArrayList arrayList, Context context, boolean z14) {
        context.getClass();
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(b((ConversationCommentDTO) it.next(), context, z14));
        }
        return arrayList2;
    }
}
