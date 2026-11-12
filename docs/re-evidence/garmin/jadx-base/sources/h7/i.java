package h7;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f82329a;

    public i(Object obj) {
        this.f82329a = (LocaleList) obj;
    }

    @Override // h7.h
    public final String a() {
        return this.f82329a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        return this.f82329a.equals(((h) obj).getLocaleList());
    }

    @Override // h7.h
    public final Locale get(int i14) {
        return this.f82329a.get(i14);
    }

    @Override // h7.h
    public final LocaleList getLocaleList() {
        return this.f82329a;
    }

    public final int hashCode() {
        return this.f82329a.hashCode();
    }

    @Override // h7.h
    public final boolean isEmpty() {
        return this.f82329a.isEmpty();
    }

    @Override // h7.h
    public final int size() {
        return this.f82329a.size();
    }

    public final String toString() {
        return this.f82329a.toString();
    }
}
