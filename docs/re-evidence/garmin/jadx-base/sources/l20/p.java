package l20;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\tB#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ll20/p;", "Ll20/d;", "", "", TtmlNode.ATTR_ID, "resourceId", "phoneTypeAndroidId", "<init>", "(Ljava/lang/String;IIII)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum p implements d {
    MOBILE(1, R.string.contact_management_contact_info_label_mobile, 2),
    /* JADX INFO: Fake field, exist only in values array */
    HOME(2, R.string.contact_management_contact_info_label_home, 1),
    /* JADX INFO: Fake field, exist only in values array */
    WORK(3, R.string.contact_management_contact_info_label_work, 3),
    OTHER(4, R.string.contact_management_contact_info_label_other, 7);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f109036d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109042c;

    p(int i14, int i15, int i16) {
        this.f109040a = i14;
        this.f109041b = i15;
        this.f109042c = i16;
    }

    @Override // l20.d
    /* JADX INFO: renamed from: H, reason: from getter */
    public final int getF109041b() {
        return this.f109041b;
    }

    @Override // l20.d
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final int getF109040a() {
        return this.f109040a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll20/p$a;", "", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
