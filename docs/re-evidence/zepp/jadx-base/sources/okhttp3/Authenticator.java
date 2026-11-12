package okhttp3;

import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public interface Authenticator {
    public static final Authenticator NONE = new a();

    public class a implements Authenticator {
        @Override // okhttp3.Authenticator
        public Request authenticate(@Nullable Route route, Response response) {
            return null;
        }
    }

    @Nullable
    Request authenticate(@Nullable Route route, Response response) throws IOException;
}
