package c73;

import android.os.ParcelFileDescriptor;
import com.google.firebase.messaging.l;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public class b implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ParcelFileDescriptor f25256a;

    public b(ParcelFileDescriptor parcelFileDescriptor) {
        this.f25256a = parcelFileDescriptor;
    }

    @Override // c73.c.b
    public final FileChannel getChannel() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = this.f25256a;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        l.j(parcelFileDescriptor, "Not a file: ");
        return null;
    }
}
