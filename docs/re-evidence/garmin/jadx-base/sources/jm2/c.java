package jm2;

import i83.f;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljm2/c;", "", "Lc83/d;", "Lokhttp3/ResponseBody;", "a", "()Lc83/d;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c {
    @f("/mobile-data/bond/blacklist.json")
    c83.d<ResponseBody> a();
}
