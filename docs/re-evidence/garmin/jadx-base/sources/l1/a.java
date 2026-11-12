package l1;

import b0.l0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC2071a f108045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0.j f108046b;

    /* JADX INFO: renamed from: l1.a$a, reason: collision with other inner class name */
    public enum EnumC2071a {
        PREVIEW_VIEW,
        SCREEN_FLASH_VIEW
    }

    public a(EnumC2071a enumC2071a, l0.j jVar) {
        this.f108045a = enumC2071a;
        this.f108046b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f108045a == aVar.f108045a && Objects.equals(this.f108046b, aVar.f108046b);
    }

    public final int hashCode() {
        return Objects.hash(this.f108045a, this.f108046b);
    }
}
