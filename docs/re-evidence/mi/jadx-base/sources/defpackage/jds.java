package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.tasks.Tasks;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes5.dex */
public final class jds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7s f22688a;

    public jds(i7s i7sVar) {
        this.f22688a = i7sVar;
    }

    public final InputStream a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) Tasks.await(((vgt) this.f22688a.a()).c(i, str, str2, i2));
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                throw new ugs(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), i);
            }
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        } catch (InterruptedException e) {
            throw new ugs("Extractor was interrupted while waiting for chunk file.", e, i);
        } catch (ExecutionException e2) {
            throw new ugs(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), e2, i);
        }
    }
}
