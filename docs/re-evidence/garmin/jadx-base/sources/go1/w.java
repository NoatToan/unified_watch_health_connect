package go1;

import android.os.Parcelable;
import android.text.Spannable;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lgo1/w;", "", "", "viewType", "", "conversationOwnedByCurrentUser", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;", "conversationCommentDTO", "Landroid/os/Parcelable;", "headerItem", "Lgo1/w$c;", "viewState", "<init>", "(IZLcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;Landroid/os/Parcelable;Lgo1/w$c;)V", "c", "b", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConversationCommentDTO f78313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Parcelable f78314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f78315e;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"go1/w$a", "Landroidx/recyclerview/widget/o$f;", "Lgo1/w;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.recyclerview.widget.o.f<w> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(w wVar, w wVar2) {
            w wVar3 = wVar;
            w wVar4 = wVar2;
            wVar3.getClass();
            wVar4.getClass();
            return wVar3.equals(wVar4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(w wVar, w wVar2) {
            w wVar3 = wVar;
            w wVar4 = wVar2;
            wVar3.getClass();
            wVar4.getClass();
            if (wVar3.f78311a != 2) {
                return wVar3.equals(wVar4);
            }
            ConversationCommentDTO conversationCommentDTO = wVar3.f78313c;
            String str = conversationCommentDTO != null ? conversationCommentDTO.f44546a : null;
            ConversationCommentDTO conversationCommentDTO2 = wVar4.f78313c;
            return p005kotlin.jvm.internal.s.g(str, conversationCommentDTO2 != null ? conversationCommentDTO2.f44546a : null);
        }
    }

    static {
        new b(null);
        new a();
    }

    public /* synthetic */ w(int i14, boolean z14, ConversationCommentDTO conversationCommentDTO, Parcelable parcelable, c cVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? null : conversationCommentDTO, (i15 & 8) == 0 ? parcelable : null, (i15 & 16) != 0 ? new c(null, false, 0, false, null, null, null, null, 255, null) : cVar);
    }

    public static w a(w wVar, wg0.a aVar) {
        int i14 = wVar.f78311a;
        boolean z14 = wVar.f78312b;
        ConversationCommentDTO conversationCommentDTO = wVar.f78313c;
        c cVar = wVar.f78315e;
        wVar.getClass();
        cVar.getClass();
        return new w(i14, z14, conversationCommentDTO, aVar, cVar);
    }

    public final boolean b() {
        boolean z14 = this.f78312b;
        ConversationCommentDTO conversationCommentDTO = this.f78313c;
        if (conversationCommentDTO == null) {
            return z14;
        }
        return p005kotlin.jvm.internal.s.g(conversationCommentDTO.f44558m, String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk())) || z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f78311a == wVar.f78311a && this.f78312b == wVar.f78312b && p005kotlin.jvm.internal.s.g(this.f78313c, wVar.f78313c) && p005kotlin.jvm.internal.s.g(this.f78314d, wVar.f78314d) && p005kotlin.jvm.internal.s.g(this.f78315e, wVar.f78315e);
    }

    public final int hashCode() {
        int iG = q6.f.g(Integer.hashCode(this.f78311a) * 31, 31, this.f78312b);
        ConversationCommentDTO conversationCommentDTO = this.f78313c;
        int iHashCode = (iG + (conversationCommentDTO == null ? 0 : conversationCommentDTO.hashCode())) * 31;
        Parcelable parcelable = this.f78314d;
        return this.f78315e.hashCode() + ((iHashCode + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CommentItem(viewType=" + this.f78311a + ", conversationOwnedByCurrentUser=" + this.f78312b + ", conversationCommentDTO=" + this.f78313c + ", headerItem=" + this.f78314d + ", viewState=" + this.f78315e + ")";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lgo1/w$b;", "", "<init>", "()V", "", "HEADER", "I", "VIEW_MORE_COMMENT", "COMMENT", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgo1/w$c;", "", "", "conversationCommentPk", "", "likedByUser", "", "likeCount", "likeInProgress", "Lu22/a;", "mode", "Landroid/text/Spannable;", "editingText", "pendingEditedComment", "", "Lmo1/a;", "pendingEditedCommentBlockList", "<init>", "(Ljava/lang/String;ZIZLu22/a;Landroid/text/Spannable;Landroid/text/Spannable;Ljava/util/List;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f78318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f78319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public u22.a f78320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Spannable f78321f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Spannable f78322g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<mo1.a> f78323h;

        public /* synthetic */ c(String str, boolean z14, int i14, boolean z15, u22.a aVar, Spannable spannable, Spannable spannable2, List list, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? 0 : i14, (i15 & 8) != 0 ? false : z15, (i15 & 16) != 0 ? u22.a.NORMAL : aVar, (i15 & 32) != 0 ? null : spannable, (i15 & 64) != 0 ? null : spannable2, (i15 & 128) != 0 ? new ArrayList() : list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f78316a, cVar.f78316a) && this.f78317b == cVar.f78317b && this.f78318c == cVar.f78318c && this.f78319d == cVar.f78319d && this.f78320e == cVar.f78320e && p005kotlin.jvm.internal.s.g(this.f78321f, cVar.f78321f) && p005kotlin.jvm.internal.s.g(this.f78322g, cVar.f78322g) && p005kotlin.jvm.internal.s.g(this.f78323h, cVar.f78323h);
        }

        public final int hashCode() {
            String str = this.f78316a;
            int iHashCode = (this.f78320e.hashCode() + q6.f.g(q2.d(this.f78318c, q6.f.g((str == null ? 0 : str.hashCode()) * 31, 31, this.f78317b), 31), 31, this.f78319d)) * 31;
            Spannable spannable = this.f78321f;
            int iHashCode2 = (iHashCode + (spannable == null ? 0 : spannable.hashCode())) * 31;
            Spannable spannable2 = this.f78322g;
            return this.f78323h.hashCode() + ((iHashCode2 + (spannable2 != null ? spannable2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            boolean z14 = this.f78319d;
            u22.a aVar = this.f78320e;
            Spannable spannable = this.f78321f;
            Spannable spannable2 = this.f78322g;
            StringBuilder sbD = zl.a.d("ViewState(conversationCommentPk=", this.f78316a, ", likedByUser=", this.f78317b, ", likeCount=");
            fb1.c.x(sbD, this.f78318c, ", likeInProgress=", z14, ", mode=");
            sbD.append(aVar);
            sbD.append(", editingText=");
            sbD.append((Object) spannable);
            sbD.append(", pendingEditedComment=");
            sbD.append((Object) spannable2);
            sbD.append(", pendingEditedCommentBlockList=");
            sbD.append(this.f78323h);
            sbD.append(")");
            return sbD.toString();
        }

        public c(String str, boolean z14, int i14, boolean z15, u22.a aVar, Spannable spannable, Spannable spannable2, List<mo1.a> list) {
            aVar.getClass();
            list.getClass();
            this.f78316a = str;
            this.f78317b = z14;
            this.f78318c = i14;
            this.f78319d = z15;
            this.f78320e = aVar;
            this.f78321f = spannable;
            this.f78322g = spannable2;
            this.f78323h = list;
        }

        public c() {
            this(null, false, 0, false, null, null, null, null, 255, null);
        }
    }

    public w(int i14, boolean z14, ConversationCommentDTO conversationCommentDTO, Parcelable parcelable, c cVar) {
        cVar.getClass();
        this.f78311a = i14;
        this.f78312b = z14;
        this.f78313c = conversationCommentDTO;
        this.f78314d = parcelable;
        this.f78315e = cVar;
    }
}
