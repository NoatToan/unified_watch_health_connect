package defpackage;

import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class bag implements ttf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qtf f3986b;
    public final ConcurrentHashMap<String, Phonemetadata$PhoneMetadata> c;
    public final ConcurrentHashMap<Integer, Phonemetadata$PhoneMetadata> d;

    public bag(String str, qtf qtfVar) {
        this.c = new ConcurrentHashMap<>();
        this.d = new ConcurrentHashMap<>();
        this.f3985a = str;
        this.f3986b = qtfVar;
    }

    @Override // defpackage.ttf
    public Phonemetadata$PhoneMetadata a(String str) {
        return rtf.a(str, this.c, this.f3985a, this.f3986b);
    }

    @Override // defpackage.ttf
    public Phonemetadata$PhoneMetadata b(int i) {
        if (c(i)) {
            return rtf.a(Integer.valueOf(i), this.d, this.f3985a, this.f3986b);
        }
        return null;
    }

    public final boolean c(int i) {
        List<String> list = bm4.a().get(Integer.valueOf(i));
        return list.size() == 1 && "001".equals(list.get(0));
    }

    public bag(qtf qtfVar) {
        this("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto", qtfVar);
    }
}
