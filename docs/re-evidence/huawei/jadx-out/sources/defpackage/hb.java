package defpackage;

import com.airbnb.lottie.network.LottieFetchResult;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes21.dex */
public class hb implements LottieNetworkFetcher {
    @Override // com.airbnb.lottie.network.LottieNetworkFetcher
    public LottieFetchResult fetchSync(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new gz(httpURLConnection);
    }
}
