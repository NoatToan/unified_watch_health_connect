package yj1;

import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lyj1/f;", "", "<init>", "()V", "d", "b", "a", "c", "Lyj1/f$b;", "Lyj1/f$c;", "Lyj1/f$d;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f {
    static {
        new a(null);
    }

    public /* synthetic */ f(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lyj1/f$a;", "", "<init>", "()V", "", "ITEM_TYPE_HEADER", "I", "ITEM_TYPE_EMERGENCY_CONTACT", "ITEM_TYPE_FOOTER", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private f() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyj1/f$c;", "Lyj1/f;", "", "footerTextResource", "<init>", "(I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f197540a;

        public /* synthetic */ c(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? -1 : i14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f197540a == ((c) obj).f197540a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f197540a);
        }

        public final String toString() {
            return e0.f(this.f197540a, "FooterItem(footerTextResource=", ")");
        }

        public c(int i14) {
            super(null);
            this.f197540a = i14;
        }

        public c() {
            this(0, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyj1/f$d;", "Lyj1/f;", "", "headerTextResource", "<init>", "(I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f197541a;

        public /* synthetic */ d(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? -1 : i14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f197541a == ((d) obj).f197541a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f197541a);
        }

        public final String toString() {
            return e0.f(this.f197541a, "HeaderItem(headerTextResource=", ")");
        }

        public d(int i14) {
            super(null);
            this.f197541a = i14;
        }

        public d() {
            this(0, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyj1/f$b;", "Lyj1/f;", "", "contactName", "", "metaTextResource", "sosIconResource", "Lcom/garmin/android/apps/connectmobile/contacts/model/a;", "confirmationStatus", "", "showWarningIcon", "Ll20/a;", "contactDTO", "<init>", "(Ljava/lang/String;IILcom/garmin/android/apps/connectmobile/contacts/model/a;ZLl20/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f197534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f197535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f197536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.contacts.model.a f197537d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f197538e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final l20.a f197539f;

        public /* synthetic */ b(String str, int i14, int i15, com.garmin.android.apps.connectmobile.contacts.model.a aVar, boolean z14, l20.a aVar2, int i16, p005kotlin.jvm.internal.j jVar) {
            this((i16 & 1) != 0 ? "" : str, (i16 & 2) != 0 ? -1 : i14, (i16 & 4) != 0 ? -1 : i15, (i16 & 8) != 0 ? null : aVar, (i16 & 16) != 0 ? false : z14, (i16 & 32) != 0 ? null : aVar2);
        }

        public static b a(l20.a aVar, f20.e0 e0Var, boolean z14, com.garmin.android.apps.connectmobile.contacts.model.a aVar2) {
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            int i30;
            boolean z15;
            List<l20.c> listR = aVar.r();
            boolean z16 = false;
            if (listR != null) {
                i14 = 0;
                i15 = 0;
                i16 = 0;
                i17 = 0;
                i18 = 0;
                for (l20.c cVar : listR) {
                    if (cVar.H()) {
                        i14++;
                    } else if (cVar.Z()) {
                        i15++;
                    } else if (!cVar.M()) {
                        if (cVar.I()) {
                            i16++;
                        } else if (!cVar.a0() && cVar.G()) {
                            i17++;
                        }
                    }
                    if (!gl1.d.J(cVar)) {
                        i18++;
                    }
                }
            } else {
                i14 = 0;
                i15 = 0;
                i16 = 0;
                i17 = 0;
                i18 = 0;
            }
            List<l20.c> listZ = aVar.z();
            if (listZ != null) {
                i19 = 0;
                i24 = 0;
                i25 = 0;
                i26 = 0;
                i27 = 0;
                i28 = 0;
                for (l20.c cVar2 : listZ) {
                    if (cVar2.d() && cVar2.G()) {
                        i19++;
                    } else if (!cVar2.f() && cVar2.G()) {
                        i25++;
                    }
                    if (cVar2.H()) {
                        i26++;
                    } else if (cVar2.Z()) {
                        i27++;
                    } else if (!cVar2.M()) {
                        if (cVar2.I()) {
                            i24++;
                        } else {
                            cVar2.a0();
                        }
                    }
                    if (!gl1.d.K(cVar2, e0Var) && s.g(cVar2.getIsValid(), Boolean.FALSE)) {
                        i28++;
                    }
                }
            } else {
                i19 = 0;
                i24 = 0;
                i25 = 0;
                i26 = 0;
                i27 = 0;
                i28 = 0;
            }
            List<l20.c> listZ2 = aVar.z();
            int size = listZ2 != null ? ge1.b.s(listZ2).size() : 0;
            List<l20.c> listR2 = aVar.r();
            int size2 = (listR2 != null ? ge1.b.s(listR2).size() : 0) + size;
            boolean z17 = i16 + i24 == size2;
            if (i28 + i18 > 0 || i19 > 0 || z17 || (size != 0 && i24 == size && i15 > 0)) {
                z16 = true;
            }
            int i34 = (i19 == size2 || z17) ? -1 : (i14 > 0 || i26 > 0) ? 2131231821 : 2131231822;
            if (i19 == size2) {
                i29 = R.string.opted_out_of_emergency_messages;
            } else if (z17) {
                i29 = R.string.review_contact_details_sentence_case;
            } else if (i26 > 0 && i14 > 0) {
                i29 = R.string.contacts_validation_text_email_alerts_title;
            } else if (i14 > 0 && i26 == 0 && z14) {
                i29 = R.string.add_a_phone_number;
            } else if (i14 > 0) {
                i29 = R.string.contacts_validation_email_alerts_title;
            } else if (i26 > 0) {
                i29 = R.string.contacts_validation_text_alerts_title;
            } else if (i27 > 0 || i15 > 0) {
                i29 = R.string.request_pending;
            } else if (i17 > 0 || i25 > 0) {
                i29 = R.string.send_assistance_contact_request;
            } else {
                if (i18 <= 0) {
                    if (i28 > 0) {
                        i29 = R.string.lbl_recipient_invalid_phone_number;
                    } else {
                        i30 = R.string.needs_to_opt_in_to_receive_emergency_alerts;
                        z15 = true;
                    }
                    return new b(aVar.j(), i30, i34, aVar2, z15, aVar);
                }
                i29 = R.string.live_track_config_msg_invalid_email_address;
            }
            i30 = i29;
            z15 = z16;
            return new b(aVar.j(), i30, i34, aVar2, z15, aVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f197534a, bVar.f197534a) && this.f197535b == bVar.f197535b && this.f197536c == bVar.f197536c && this.f197537d == bVar.f197537d && this.f197538e == bVar.f197538e && s.g(this.f197539f, bVar.f197539f);
        }

        public final int hashCode() {
            int iD = q2.d(this.f197536c, q2.d(this.f197535b, this.f197534a.hashCode() * 31, 31), 31);
            com.garmin.android.apps.connectmobile.contacts.model.a aVar = this.f197537d;
            int iG = q6.f.g((iD + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f197538e);
            l20.a aVar2 = this.f197539f;
            return iG + (aVar2 != null ? aVar2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbK = androidx.core.view.j.k(this.f197535b, "ContentItem(contactName=", this.f197534a, ", metaTextResource=", ", sosIconResource=");
            sbK.append(this.f197536c);
            sbK.append(", confirmationStatus=");
            sbK.append(this.f197537d);
            sbK.append(", showWarningIcon=");
            sbK.append(this.f197538e);
            sbK.append(", contactDTO=");
            sbK.append(this.f197539f);
            sbK.append(")");
            return sbK.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i14, int i15, com.garmin.android.apps.connectmobile.contacts.model.a aVar, boolean z14, l20.a aVar2) {
            super(null);
            str.getClass();
            this.f197534a = str;
            this.f197535b = i14;
            this.f197536c = i15;
            this.f197537d = aVar;
            this.f197538e = z14;
            this.f197539f = aVar2;
        }

        public b() {
            this(null, 0, 0, null, false, null, 63, null);
        }
    }
}
