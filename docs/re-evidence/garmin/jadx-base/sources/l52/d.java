package l52;

import com.garmin.android.apps.connectmobile.v2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.AudioDownloadRepository$downloadAudioFile$2", f = "AudioDownloadRepository.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f110234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f110235b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, File file, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f110234a = str;
        this.f110235b = file;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f110234a, this.f110235b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends String>> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        InputStream inputStreamOpenStream = new URL(this.f110234a).openStream();
        File file = this.f110235b;
        try {
            ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamOpenStream);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.getChannel().transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
                    fileOutputStream.close();
                    jg.b.l(readableByteChannelNewChannel, null);
                    jg.b.l(inputStreamOpenStream, null);
                    return (!file.exists() || file.length() <= 0) ? new v2.a(new Exception("File not downloaded"), null, null, 6, null) : new v2.b(file.getAbsolutePath(), 200, null, null, 12, null);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(fileOutputStream, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    jg.b.l(readableByteChannelNewChannel, th5);
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                jg.b.l(inputStreamOpenStream, th7);
                throw th8;
            }
        }
    }
}
