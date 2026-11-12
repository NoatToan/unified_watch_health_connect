package hj2;

import c83.a0;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import i83.t;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JP\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lhj2/e;", "", "", Action.KEY_ATTRIBUTE, "text", "countries", "", MapboxMap.QFE_LIMIT, TtmlNode.RUBY_CONTAINER, "Lc83/a0;", "", "Lfj2/f;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lfj2/i;", "a", "(Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface e {
    @i83.f("/Capture/Interactive/Retrieve/v1.2/json.ws")
    Object a(@t("Key") String str, @t("Id") String str2, t13.d<? super a0<List<fj2.i>>> dVar);

    @i83.f("/Capture/Interactive/Find/v1.10/json.ws")
    Object b(@t("Key") String str, @t("Text") String str2, @t("Countries") String str3, @t("Limit") int i14, @t("Container") String str4, t13.d<? super a0<List<fj2.f>>> dVar);
}
