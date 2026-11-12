package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public class leh extends keh {

    @RequiresApi(21)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f24973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f24974b;

        public a(OutputConfiguration outputConfiguration) {
            this.f24973a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f24973a, aVar.f24973a) && Objects.equals(this.f24974b, aVar.f24974b);
        }

        public int hashCode() {
            int iHashCode = this.f24973a.hashCode() ^ 31;
            int i = (iHashCode << 5) - iHashCode;
            String str = this.f24974b;
            return (str == null ? 0 : str.hashCode()) ^ i;
        }
    }

    public leh(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    @RequiresApi(26)
    public static leh e(OutputConfiguration outputConfiguration) {
        return new leh(new a(outputConfiguration));
    }

    @Override // defpackage.neh, jeh.a
    public String b() {
        return ((a) this.f27855a).f24974b;
    }

    @Override // defpackage.neh, jeh.a
    public void c(String str) {
        ((a) this.f27855a).f24974b = str;
    }

    @Override // defpackage.keh, defpackage.neh, jeh.a
    public Object d() {
        g6i.a(this.f27855a instanceof a);
        return ((a) this.f27855a).f24973a;
    }

    public leh(Object obj) {
        super(obj);
    }
}
