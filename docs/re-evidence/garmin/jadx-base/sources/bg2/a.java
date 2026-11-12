package bg2;

import i83.s;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lbg2/a;", "", "", "locale", "category", "name", "Lc83/d;", "Lbg2/h;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lc83/d;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f("/web-data/exercises/{locale}/{category}/{name}.json")
    c83.d<h> a(@s("locale") String locale, @s("category") String category, @s("name") String name);
}
