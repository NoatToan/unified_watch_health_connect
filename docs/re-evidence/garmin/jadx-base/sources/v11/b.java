package v11;

import b11.o;
import b11.v;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.gncs.NotificationConstants;
import g21.f0;
import g21.h;
import g21.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes9.dex */
public interface b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv11/b$a;", "Lv11/b;", "Lv11/d;", "textResource", "Lu4/d;", "icon", "<init>", "(Lv11/d;Lu4/d;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v11.d f174668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u4.d f174669b;

        public a(v11.d dVar, u4.d dVar2) {
            dVar.getClass();
            dVar2.getClass();
            this.f174668a = dVar;
            this.f174669b = dVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f174668a.equals(aVar.f174668a) && this.f174669b.equals(aVar.f174669b);
        }

        public final int hashCode() {
            return this.f174669b.hashCode() + (this.f174668a.hashCode() * 31);
        }

        public final String toString() {
            return "Button(textResource=" + this.f174668a + ", icon=" + this.f174669b + ")";
        }
    }

    /* JADX INFO: renamed from: v11.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv11/b$b;", "Lv11/b;", "Lv11/d;", "textResource", "<init>", "(Lv11/d;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3248b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v11.d f174670a;

        public C3248b(v11.d dVar) {
            dVar.getClass();
            this.f174670a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3248b) && this.f174670a.equals(((C3248b) obj).f174670a);
        }

        public final int hashCode() {
            return this.f174670a.hashCode();
        }

        public final String toString() {
            return "InfoMessage(textResource=" + this.f174670a + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lv11/b$c;", "Lv11/b;", "Lg21/h;", "dailySummary", "Lg21/p;", "mealDetails", "Lg21/f0;", "foodNutritionContent", "Li53/c;", "Lb11/o;", "micronutrientEntries", "<init>", "(Lg21/h;Lg21/p;Lg21/f0;Li53/c;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f174671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p f174672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f0 f174673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i53.c<o> f174674d;

        public c(h hVar, p pVar, f0 f0Var, i53.c<o> cVar) {
            hVar.getClass();
            f0Var.getClass();
            cVar.getClass();
            this.f174671a = hVar;
            this.f174672b = pVar;
            this.f174673c = f0Var;
            this.f174674d = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f174671a.equals(cVar.f174671a) && s.g(this.f174672b, cVar.f174672b) && this.f174673c.equals(cVar.f174673c) && this.f174674d.equals(cVar.f174674d);
        }

        public final int hashCode() {
            int iHashCode = this.f174671a.hashCode() * 31;
            p pVar = this.f174672b;
            return this.f174674d.hashCode() + ((this.f174673c.hashCode() + ((iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "MacroGoalsChart(dailySummary=" + this.f174671a + ", mealDetails=" + this.f174672b + ", foodNutritionContent=" + this.f174673c + ", micronutrientEntries=" + this.f174674d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv11/b$d;", "Lv11/b;", "Lv11/d;", "textResource", "<init>", "(Lv11/d;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v11.d f174675a;

        public d(v11.d dVar) {
            dVar.getClass();
            this.f174675a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f174675a.equals(((d) obj).f174675a);
        }

        public final int hashCode() {
            return this.f174675a.hashCode();
        }

        public final String toString() {
            return "SectionHeader(textResource=" + this.f174675a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lv11/b$e;", "Lv11/b;", "Lb11/v;", "food", "", "isSelected", "Lv11/c;", NotificationConstants.KEY_DATA_MIME_TYPE, "", Action.KEY_ATTRIBUTE, "<init>", "(Lb11/v;ZLv11/c;Ljava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f174676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f174677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v11.c f174678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f174679d;

        public e(v vVar, boolean z14, v11.c cVar, String str) {
            vVar.getClass();
            cVar.getClass();
            str.getClass();
            this.f174676a = vVar;
            this.f174677b = z14;
            this.f174678c = cVar;
            this.f174679d = str;
        }

        public static e a(e eVar, v vVar, boolean z14, int i14) {
            if ((i14 & 1) != 0) {
                vVar = eVar.f174676a;
            }
            if ((i14 & 2) != 0) {
                z14 = eVar.f174677b;
            }
            return new e(vVar, z14, eVar.f174678c, eVar.f174679d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f174676a.equals(eVar.f174676a) && this.f174677b == eVar.f174677b && this.f174678c == eVar.f174678c && this.f174679d.equals(eVar.f174679d);
        }

        public final int hashCode() {
            return this.f174679d.hashCode() + ((this.f174678c.hashCode() + f.g(this.f174676a.hashCode() * 31, 31, this.f174677b)) * 31);
        }

        public final String toString() {
            return "SelectableFoodItem(food=" + this.f174676a + ", isSelected=" + this.f174677b + ", type=" + this.f174678c + ", key=" + this.f174679d + ")";
        }
    }
}
