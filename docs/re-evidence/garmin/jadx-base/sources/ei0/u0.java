package ei0;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\t\n\u000bB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lei0/u0;", "Lid1/c$a;", "Lei0/u0$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lei0/u0$b;", "followingSelectionListener", "<init>", "(Landroid/content/Context;Lei0/u0$b;)V", "b", "a", "c", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u0 implements id1.c.a<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f64329b;

    public interface b {
        default void a(a aVar) {
        }

        default void b(a aVar) {
        }

        void c(a aVar);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lei0/u0$c;", "Lid1/c$c;", "Lei0/u0$a;", "Lg10/b;", "view", "Lid1/c$d;", "mDelegate", "<init>", "(Lei0/u0;Lg10/b;Lid1/c$d;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends id1.c.AbstractC1775c<a> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f64351e = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g10.b f64352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u0 f64353d;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f64354a;

            static {
                int[] iArr = new int[a.b.values().length];
                try {
                    iArr[a.b.RequestSent.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.b.Added.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.b.None.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f64354a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(u0 u0Var, g10.b bVar, id1.c.d dVar) {
            super(bVar, dVar);
            bVar.getClass();
            dVar.getClass();
            this.f64353d = u0Var;
            this.f64352c = bVar;
        }

        @Override // id1.c.AbstractC1775c
        public final void e(id1.c.e eVar) {
            final a aVar = (a) eVar;
            String str = aVar.f64339j;
            String str2 = aVar.f64338i;
            g10.b bVar = this.f64352c;
            bVar.getProfilePic().setProfileImageData(aVar.f64341l);
            TextView dataLine1 = bVar.getDataLine1();
            String strG = aVar.f64332c;
            dataLine1.setText(strG);
            String str3 = aVar.f64333d;
            if (d53.w.J(str3)) {
                bVar.getDataLine2().setVisibility(8);
            } else {
                bVar.getDataLine2().setVisibility(0);
                bVar.getDataLine2().setText(str3);
                strG = strG + ", " + ((Object) bVar.getDataLine2().getText());
            }
            bVar.getHeaderLetter().setVisibility(8);
            int i14 = a.f64354a[aVar.f64336g.ordinal()];
            final u0 u0Var = this.f64353d;
            if (i14 == 1) {
                bVar.getAddText().setVisibility(0);
                bVar.getAddText().setText(u0Var.f64328a.getString(R.string.connection_request_sent));
                bVar.getAddText().setTextAppearance(R.style.Text_Caption_Secondary);
                strG = strG + ", " + ((Object) bVar.getAddText().getText());
            } else if (i14 == 2) {
                bVar.getAddText().setVisibility(0);
                bVar.getAddText().setText(u0Var.f64328a.getString(R.string.wifi_added));
                bVar.getAddText().setTextAppearance(R.style.Text_Caption_Secondary);
                strG = strG + ", " + ((Object) bVar.getAddText().getText());
            } else {
                if (i14 != 3) {
                    lc.u0.r();
                    return;
                }
                bVar.getAddText().setVisibility(8);
            }
            if (aVar.f64337h) {
                strG = e5.g(strG, ", ", u0Var.f64328a.getString(R.string.activities_extended_map_legend_selected));
                bVar.getSelectedCheckmark().setVisibility(0);
            } else {
                bVar.getSelectedCheckmark().setVisibility(8);
            }
            bVar.setContentDescription(strG);
            if (aVar.f64335f) {
                final int i15 = 0;
                bVar.setOnClickListener(new View.OnClickListener() { // from class: ei0.v0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i16 = i15;
                        u0.a aVar2 = aVar;
                        u0 u0Var2 = u0Var;
                        switch (i16) {
                            case 0:
                                int i17 = u0.c.f64351e;
                                u0.b bVar2 = u0Var2.f64329b;
                                if (bVar2 != null) {
                                    bVar2.c(aVar2);
                                }
                                break;
                            case 1:
                                int i18 = u0.c.f64351e;
                                u0.b bVar3 = u0Var2.f64329b;
                                if (bVar3 != null) {
                                    bVar3.a(aVar2);
                                }
                                break;
                            default:
                                int i19 = u0.c.f64351e;
                                u0.b bVar4 = u0Var2.f64329b;
                                if (bVar4 != null) {
                                    bVar4.b(aVar2);
                                }
                                break;
                        }
                    }
                });
            } else {
                bVar.setClickable(false);
            }
            bVar.getRequestsLayout().setVisibility(8);
            if (str2 == null) {
                bVar.getAcceptButton().setVisibility(8);
            } else {
                bVar.getRequestsLayout().setVisibility(0);
                bVar.getAcceptButton().setVisibility(0);
                bVar.getAcceptButton().setText(str2);
                final int i16 = 1;
                bVar.getAcceptButton().setOnClickListener(new View.OnClickListener() { // from class: ei0.v0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i17 = i16;
                        u0.a aVar2 = aVar;
                        u0 u0Var2 = u0Var;
                        switch (i17) {
                            case 0:
                                int i18 = u0.c.f64351e;
                                u0.b bVar2 = u0Var2.f64329b;
                                if (bVar2 != null) {
                                    bVar2.c(aVar2);
                                }
                                break;
                            case 1:
                                int i19 = u0.c.f64351e;
                                u0.b bVar3 = u0Var2.f64329b;
                                if (bVar3 != null) {
                                    bVar3.a(aVar2);
                                }
                                break;
                            default:
                                int i110 = u0.c.f64351e;
                                u0.b bVar4 = u0Var2.f64329b;
                                if (bVar4 != null) {
                                    bVar4.b(aVar2);
                                }
                                break;
                        }
                    }
                });
            }
            if (str == null) {
                bVar.getIgnoreButton().setVisibility(8);
                return;
            }
            bVar.getRequestsLayout().setVisibility(0);
            bVar.getIgnoreButton().setVisibility(0);
            bVar.getIgnoreButton().setText(str);
            Button ignoreButton = bVar.getIgnoreButton();
            final int i17 = 2;
            ignoreButton.setOnClickListener(new View.OnClickListener() { // from class: ei0.v0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i18 = i17;
                    u0.a aVar2 = aVar;
                    u0 u0Var2 = u0Var;
                    switch (i18) {
                        case 0:
                            int i19 = u0.c.f64351e;
                            u0.b bVar2 = u0Var2.f64329b;
                            if (bVar2 != null) {
                                bVar2.c(aVar2);
                            }
                            break;
                        case 1:
                            int i110 = u0.c.f64351e;
                            u0.b bVar3 = u0Var2.f64329b;
                            if (bVar3 != null) {
                                bVar3.a(aVar2);
                            }
                            break;
                        default:
                            int i111 = u0.c.f64351e;
                            u0.b bVar4 = u0Var2.f64329b;
                            if (bVar4 != null) {
                                bVar4.b(aVar2);
                            }
                            break;
                    }
                }
            });
        }
    }

    public u0(Context context, b bVar) {
        context.getClass();
        this.f64328a = context;
        this.f64329b = bVar;
    }

    @Override // id1.c.a
    public final Class<a> a() {
        return a.class;
    }

    @Override // id1.c.a
    public final id1.c.AbstractC1775c<a> b(LayoutInflater layoutInflater, ViewGroup viewGroup, id1.c.d dVar) {
        layoutInflater.getClass();
        dVar.getClass();
        g10.b bVar = new g10.b(this.f64328a, null, 0, 6, null);
        bVar.setLayoutParams(new RecyclerView.q(-1, -2));
        return new c(this, bVar, dVar);
    }

    public /* synthetic */ u0(Context context, b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : bVar);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lei0/u0$a;", "Lid1/c$e;", "", "userId", "", "avatarUrl", "name", "statusText", "", "level", "", "isClickable", "Lei0/u0$a$b;", "requestStatus", "isSelected", "positiveButtonText", "negativeButtonText", "Lei0/u0$a$a;", "inviteType", "Lb12/b;", "profileImageData", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLei0/u0$a$b;ZLjava/lang/String;Ljava/lang/String;Lei0/u0$a$a;Lb12/b;)V", "a", "b", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements id1.c.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f64330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f64333d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f64334e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f64335f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f64336g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f64337h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f64338i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f64339j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final EnumC1362a f64340k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final b12.b f64341l;

        /* JADX INFO: renamed from: ei0.u0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lei0/u0$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public enum EnumC1362a {
            IssuedInvite,
            ReceivedInvite,
            Child,
            AdminGuardian
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lei0/u0$a$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public enum b {
            None,
            RequestSent,
            Added
        }

        static {
            Parcelable.Creator<b12.b> creator = b12.b.CREATOR;
        }

        public /* synthetic */ a(long j8, String str, String str2, String str3, int i14, boolean z14, b bVar, boolean z15, String str4, String str5, EnumC1362a enumC1362a, b12.b bVar2, int i15, p005kotlin.jvm.internal.j jVar) {
            this(j8, str, str2, str3, i14, z14, (i15 & 64) != 0 ? b.None : bVar, (i15 & 128) != 0 ? false : z15, (i15 & 256) != 0 ? null : str4, (i15 & 512) != 0 ? null : str5, (i15 & 1024) != 0 ? null : enumC1362a, bVar2);
        }

        public static a d(a aVar, boolean z14) {
            long j8 = aVar.f64330a;
            String str = aVar.f64331b;
            String str2 = aVar.f64332c;
            String str3 = aVar.f64333d;
            int i14 = aVar.f64334e;
            boolean z15 = aVar.f64335f;
            b bVar = aVar.f64336g;
            String str4 = aVar.f64338i;
            String str5 = aVar.f64339j;
            EnumC1362a enumC1362a = aVar.f64340k;
            b12.b bVar2 = aVar.f64341l;
            str2.getClass();
            str3.getClass();
            bVar.getClass();
            bVar2.getClass();
            return new a(j8, str, str2, str3, i14, z15, bVar, z14, str4, str5, enumC1362a, bVar2);
        }

        @Override // id1.c.e
        public final boolean a(id1.c.e eVar) {
            eVar.getClass();
            if (eVar instanceof a) {
                return this.f64330a == ((a) eVar).f64330a;
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f64330a == aVar.f64330a && p005kotlin.jvm.internal.s.g(this.f64331b, aVar.f64331b) && p005kotlin.jvm.internal.s.g(this.f64332c, aVar.f64332c) && p005kotlin.jvm.internal.s.g(this.f64333d, aVar.f64333d) && this.f64334e == aVar.f64334e && this.f64335f == aVar.f64335f && this.f64336g == aVar.f64336g && this.f64337h == aVar.f64337h && p005kotlin.jvm.internal.s.g(this.f64338i, aVar.f64338i) && p005kotlin.jvm.internal.s.g(this.f64339j, aVar.f64339j) && this.f64340k == aVar.f64340k && p005kotlin.jvm.internal.s.g(this.f64341l, aVar.f64341l);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f64330a) * 31;
            String str = this.f64331b;
            int iG = q6.f.g((this.f64336g.hashCode() + q6.f.g(q2.d(this.f64334e, wr.g.j(wr.g.j((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f64332c), 31, this.f64333d), 31), 31, this.f64335f)) * 31, 31, this.f64337h);
            String str2 = this.f64338i;
            int iHashCode2 = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f64339j;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            EnumC1362a enumC1362a = this.f64340k;
            return this.f64341l.hashCode() + ((iHashCode3 + (enumC1362a != null ? enumC1362a.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f64330a, "FollowingModel(userId=", ", avatarUrl=", this.f64331b);
            sn.a.t(sbK, ", name=", this.f64332c, ", statusText=", this.f64333d);
            sbK.append(", level=");
            sbK.append(this.f64334e);
            sbK.append(", isClickable=");
            sbK.append(this.f64335f);
            sbK.append(", requestStatus=");
            sbK.append(this.f64336g);
            sbK.append(", isSelected=");
            sbK.append(this.f64337h);
            sn.a.t(sbK, ", positiveButtonText=", this.f64338i, ", negativeButtonText=", this.f64339j);
            sbK.append(", inviteType=");
            sbK.append(this.f64340k);
            sbK.append(", profileImageData=");
            sbK.append(this.f64341l);
            sbK.append(")");
            return sbK.toString();
        }

        public a(long j8, String str, String str2, String str3, int i14, boolean z14, b bVar, boolean z15, String str4, String str5, EnumC1362a enumC1362a, b12.b bVar2) {
            str2.getClass();
            str3.getClass();
            bVar.getClass();
            bVar2.getClass();
            this.f64330a = j8;
            this.f64331b = str;
            this.f64332c = str2;
            this.f64333d = str3;
            this.f64334e = i14;
            this.f64335f = z14;
            this.f64336g = bVar;
            this.f64337h = z15;
            this.f64338i = str4;
            this.f64339j = str5;
            this.f64340k = enumC1362a;
            this.f64341l = bVar2;
        }
    }
}
