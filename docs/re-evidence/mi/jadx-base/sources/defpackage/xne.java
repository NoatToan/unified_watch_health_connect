package defpackage;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public final class xne implements wne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f39281a;

    public xne(Object obj) {
        this.f39281a = (LocaleList) obj;
    }

    @Override // defpackage.wne
    public Object a() {
        return this.f39281a;
    }

    public boolean equals(Object obj) {
        return this.f39281a.equals(((wne) obj).a());
    }

    @Override // defpackage.wne
    public Locale get(int i) {
        return this.f39281a.get(i);
    }

    public int hashCode() {
        return this.f39281a.hashCode();
    }

    @Override // defpackage.wne
    public int size() {
        return this.f39281a.size();
    }

    public String toString() {
        return this.f39281a.toString();
    }
}
