package l52;

import android.os.Parcelable;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public interface i<T extends Parcelable> extends Parcelable, s<T> {

    public interface a<T extends Parcelable> extends s<T> {
        boolean d(a<T> aVar);

        boolean f();

        T getData();

        int getDepth();

        int getHeight();

        f.a getParent();

        g getPath();

        UUID getUuid();

        boolean isFirst();

        boolean k();
    }

    public interface b<T extends Parcelable> {
    }

    e.b J();

    e.b K1();

    m L1(e23.l lVar);

    e.b n3(b bVar);
}
