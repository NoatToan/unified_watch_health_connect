package o73;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.compose.resources.AndroidContextProvider;
import org.jetbrains.compose.resources.MissingResourceException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo73/q;", "Lo73/o;", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f130773a = o13.m.b(a.f130774a);

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/res/AssetManager;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<AssetManager> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f130774a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final AssetManager invoke() {
            AndroidContextProvider.f133491a.getClass();
            Context context = AndroidContextProvider.f133492b;
            if (context != null) {
                return context.getAssets();
            }
            vb.h.z("Android context is not initialized. If it happens in the Preview mode then call PreviewContextConfigurationEffect() function.");
            return null;
        }
    }

    @Override // o73.o
    public final Object a(long j8, long j14, String str) throws MissingResourceException, IOException {
        AssetManager assets;
        InputStream resourceAsStream;
        try {
            Object value = this.f130773a.getValue();
            value.getClass();
            resourceAsStream = ((AssetManager) value).open(str);
            resourceAsStream.getClass();
        } catch (FileNotFoundException unused) {
            try {
                try {
                    assets = org.jetbrains.compose.resources.a.a().getAssets();
                } catch (FileNotFoundException unused2) {
                    ClassLoader classLoader = q.class.getClassLoader();
                    if (classLoader == null) {
                        vb.h.z("Cannot find class loader");
                        return null;
                    }
                    resourceAsStream = classLoader.getResourceAsStream(str);
                    if (resourceAsStream == null) {
                        throw new MissingResourceException(str);
                    }
                }
            } catch (NoClassDefFoundError unused3) {
                assets = null;
            }
            InputStream inputStreamOpen = assets != null ? assets.open(str) : null;
            if (inputStreamOpen == null) {
                throw new FileNotFoundException("Current AssetManager is null.");
            }
            resourceAsStream = inputStreamOpen;
        }
        int i14 = (int) j14;
        byte[] bArr = new byte[i14];
        long j15 = 0;
        while (j15 < j8) {
            try {
                long jSkip = resourceAsStream.skip(j8 - j15);
                if (jSkip == 0) {
                    break;
                }
                j15 += jSkip;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(resourceAsStream, th3);
                    throw th4;
                }
            }
        }
        int i15 = 0;
        while (i15 < i14) {
            int i16 = resourceAsStream.read(bArr, i15, i14 - i15);
            if (i16 <= 0) {
                break;
            }
            i15 += i16;
        }
        Unit unit = Unit.INSTANCE;
        resourceAsStream.close();
        return bArr;
    }
}
