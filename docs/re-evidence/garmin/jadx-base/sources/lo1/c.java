package lo1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f114009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f114011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f114012d;

    public interface a {
        void b1(String str);

        void k3(ConversationCommentDTO conversationCommentDTO);
    }

    public c(Context context, String str, a aVar) {
        this.f114009a = context;
        this.f114010b = str;
        this.f114011c = aVar;
    }
}
