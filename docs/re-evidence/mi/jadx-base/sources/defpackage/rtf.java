package defpackage;

import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata;
import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadataCollection;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public final class rtf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qtf f32887a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f32888b = Logger.getLogger(rtf.class.getName());
    public static final ConcurrentHashMap<Integer, Phonemetadata$PhoneMetadata> c = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Phonemetadata$PhoneMetadata> d = new ConcurrentHashMap<>();
    public static final Set<Integer> e = w61.a();
    public static final Set<String> f = ram.a();

    public class a implements qtf {
        @Override // defpackage.qtf
        public InputStream a(String str) {
            return rtf.class.getResourceAsStream(str);
        }
    }

    public static <T> Phonemetadata$PhoneMetadata a(T t, ConcurrentHashMap<T, Phonemetadata$PhoneMetadata> concurrentHashMap, String str, qtf qtfVar) {
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = concurrentHashMap.get(t);
        if (phonemetadata$PhoneMetadata != null) {
            return phonemetadata$PhoneMetadata;
        }
        String str2 = str + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + t;
        List<Phonemetadata$PhoneMetadata> listB = b(str2, qtfVar);
        if (listB.size() > 1) {
            f32888b.log(Level.WARNING, "more than one metadata in file " + str2);
        }
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata2 = listB.get(0);
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadataPutIfAbsent = concurrentHashMap.putIfAbsent(t, phonemetadata$PhoneMetadata2);
        return phonemetadata$PhoneMetadataPutIfAbsent != null ? phonemetadata$PhoneMetadataPutIfAbsent : phonemetadata$PhoneMetadata2;
    }

    public static List<Phonemetadata$PhoneMetadata> b(String str, qtf qtfVar) {
        InputStream inputStreamA = qtfVar.a(str);
        if (inputStreamA == null) {
            throw new IllegalStateException("missing metadata: " + str);
        }
        List<Phonemetadata$PhoneMetadata> metadataList = c(inputStreamA).getMetadataList();
        if (metadataList.size() != 0) {
            return metadataList;
        }
        throw new IllegalStateException("empty metadata: " + str);
    }

    public static Phonemetadata$PhoneMetadataCollection c(InputStream inputStream) throws Throwable {
        ObjectInputStream objectInputStream = null;
        try {
            try {
                ObjectInputStream objectInputStream2 = new ObjectInputStream(inputStream);
                try {
                    Phonemetadata$PhoneMetadataCollection phonemetadata$PhoneMetadataCollection = new Phonemetadata$PhoneMetadataCollection();
                    try {
                        phonemetadata$PhoneMetadataCollection.readExternal(objectInputStream2);
                        try {
                            objectInputStream2.close();
                        } catch (IOException e2) {
                            f32888b.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e2);
                        }
                        return phonemetadata$PhoneMetadataCollection;
                    } catch (IOException e3) {
                        throw new RuntimeException("cannot load/parse metadata", e3);
                    }
                } catch (Throwable th) {
                    th = th;
                    objectInputStream = objectInputStream2;
                    try {
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        } else {
                            inputStream.close();
                        }
                    } catch (IOException e4) {
                        f32888b.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e4);
                    }
                    throw th;
                }
            } catch (IOException e5) {
                throw new RuntimeException("cannot load/parse metadata", e5);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
