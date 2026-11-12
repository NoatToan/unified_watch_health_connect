package m20;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lm20/a0;", "Lm20/g;", "Ltj1/e;", "contactsDTO", "Lo53/i0;", "Lc83/a0;", "", "c", "(Ltj1/e;)Lo53/i0;", "", "contactId", "Ll20/a;", "contactDTO", "b", "(Ljava/lang/String;Ll20/a;)Lo53/i0;", "Ll20/r;", "userContactsDTO", "d", "(Ll20/r;)Lo53/i0;", "a", "(Ll20/a;)Lo53/i0;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a0 extends g {
    @Override // m20.g
    @i83.o("/usercontact-service/v2/contacts")
    o53.i0<c83.a0<l20.a>> a(@i83.a l20.a contactDTO);

    @Override // m20.g
    @i83.p("/usercontact-service/v2/contacts/{id}")
    o53.i0<c83.a0<l20.a>> b(@i83.s(TtmlNode.ATTR_ID) String contactId, @i83.a l20.a contactDTO);

    @Override // m20.g
    @i83.p("usercontact-service/v2/contacts/ECC")
    o53.i0<c83.a0<Unit>> c(@i83.a tj1.e contactsDTO);

    @Override // m20.g
    @i83.k({"Content-Type: application/json"})
    @i83.p("/usercontact-service/v2/contacts/upsert")
    o53.i0<c83.a0<l20.r>> d(@i83.a l20.r userContactsDTO);
}
