package r92;

import c83.a0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i83.o;
import i83.s;
import i83.t;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001JD\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lr92/b;", "", "", "consentTypeId", "locale", "defaultLocale", "clientId", "Lc83/a0;", "", "Ls92/g;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "customerGUID", TtmlNode.TAG_BODY, "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface b {
    @i83.f("consentTextServices/consentText")
    Object a(@t("consentTypeId") String str, @t("locale") String str2, @t("locale") String str3, @i83.i("X-garmin-client-id") String str4, t13.d<? super a0<List<s92.g>>> dVar);

    @o("accountProcessServices/customerAccounts/{customerGUID}/checkPasswordForToken")
    Object b(@s("customerGUID") String str, @i83.a String str2, @i83.i("X-garmin-client-id") String str3, t13.d<? super a0<String>> dVar);
}
