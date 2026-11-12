package km0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF4' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB;\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkm0/d;", "", "", "titleId", "descriptionId", "hintId", "Lkotlin/Function1;", "Lkm0/b;", "", "validate", "<init>", "(Ljava/lang/String;IIILjava/lang/Integer;Le23/l;)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f105308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f105309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f105310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ d[] f105311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f105312i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f105314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f105315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<b, Boolean> f105316d;

    /* JADX INFO: Fake field, exist only in values array */
    d EF1;

    /* JADX INFO: Fake field, exist only in values array */
    d EF2;

    /* JADX INFO: Fake field, exist only in values array */
    d EF3;

    /* JADX INFO: Fake field, exist only in values array */
    d EF4;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        d dVar = new d("GroupNamePage", 0, R.string.lbl_create_a_group_title, R.string.lbl_create_a_group_description, null, new kb0.d(25), 4, null);
        f105309f = dVar;
        d dVar2 = new d("GroupPhotoPage", 1, R.string.lbl_group_photo_title, R.string.lbl_group_photo_description, null, new kb0.d(26), 4, null);
        d dVar3 = new d("GroupInformationPage", 2, R.string.lbl_group_information_title, R.string.lbl_group_information_description, null, new kb0.d(27), 4, null);
        d dVar4 = new d("GroupVisibilityPage", 3, R.string.lbl_set_group_visibility_title, R.string.lbl_set_group_visibility_description, null, null, 12, null);
        Object[] objArr = 0 == true ? 1 : 0;
        d dVar5 = new d("GroupEligibilityPage", 4, R.string.lbl_group_joining_title, R.string.lbl_group_joining_description, objArr, null, 12, null);
        d dVar6 = new d("GroupActivitiesPage", 5, R.string.lbl_set_group_activities_title, R.string.lbl_set_group_activities_description, Integer.valueOf(R.string.lbl_set_group_activities_hint), null, 8, null);
        Object[] objArr2 = 0 == true ? 1 : 0;
        d dVar7 = new d("InvitationPage", 6, R.string.social_invite_people, R.string.lbl_group_invite_people_description, objArr2, null, 12, null);
        f105310g = dVar7;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        f105311h = dVarArr;
        f105312i = new w13.c(dVarArr);
        f105308e = new a(null);
    }

    public /* synthetic */ d(String str, int i14, int i15, int i16, Integer num, e23.l lVar, int i17, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, i15, i16, (i17 & 4) != 0 ? null : num, (i17 & 8) != 0 ? new kb0.d(28) : lVar);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f105311h.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkm0/d$a;", "", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private d(String str, int i14, int i15, int i16, Integer num, e23.l lVar) {
        super(str, i14);
        this.f105313a = i15;
        this.f105314b = i16;
        this.f105315c = num;
        this.f105316d = lVar;
    }
}
