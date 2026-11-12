package androidx.health.connect.client.records;

import androidx.health.connect.client.feature.FeatureUtilsKt;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zcv;
import defpackage.zeu;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.text.MatchResult;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\u00060\rj\u0002`\u000e8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Landroidx/health/connect/client/records/FhirVersion;", "", "major", "", "minor", "patch", "<init>", "(III)V", "getMajor", "()I", "getMinor", "getPatch", "platformFhirVersion", "Landroid/health/connect/datatypes/FhirVersion;", "Landroidx/health/connect/client/impl/platform/records/PlatformFhirVersion;", "getPlatformFhirVersion$connect_client_release", "()Landroid/health/connect/datatypes/FhirVersion;", "compareTo", "other", "equals", "", "", WatchFaceConstant.HASHCODE, "toString", "", "isSupportedFhirVersion", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FhirVersion implements Comparable<FhirVersion> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final zeu VERSION_REGEX = new zeu("(\\d+)\\.(\\d+)\\.(\\d+)");
    private final int major;
    private final int minor;
    private final int patch;
    private final android.health.connect.datatypes.FhirVersion platformFhirVersion;

    public FhirVersion(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        Object objWithPhrFeatureCheck = FeatureUtilsKt.withPhrFeatureCheck((KClass<?>) zcv.b(getClass()), (Function0<? extends Object>) new Function0<android.health.connect.datatypes.FhirVersion>() { // from class: androidx.health.connect.client.records.FhirVersion$platformFhirVersion$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.health.connect.datatypes.FhirVersion invoke() {
                StringBuilder sb = new StringBuilder();
                sb.append(this.this$0.getMajor());
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                sb.append(this.this$0.getMinor());
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                sb.append(this.this$0.getPatch());
                return android.health.connect.datatypes.FhirVersion.parseFhirVersion(sb.toString());
            }

            {
                super(0);
            }
        });
        zcp.b(objWithPhrFeatureCheck, "");
        this.platformFhirVersion = FhirVersion$$ExternalSyntheticApiModelOutline0.m428m(objWithPhrFeatureCheck);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    /* JADX INFO: renamed from: getPlatformFhirVersion$connect_client_release, reason: from getter */
    public final android.health.connect.datatypes.FhirVersion getPlatformFhirVersion() {
        return this.platformFhirVersion;
    }

    @Override // java.lang.Comparable
    public int compareTo(FhirVersion other) {
        zcp.c(other, "");
        int i = this.major;
        int i2 = other.major;
        if (i != i2) {
            return i > i2 ? 1 : -1;
        }
        int i3 = this.minor;
        int i4 = other.minor;
        if (i3 != i4) {
            return i3 > i4 ? 1 : -1;
        }
        int i5 = this.patch;
        int i6 = other.patch;
        if (i5 != i6) {
            return i5 > i6 ? 1 : -1;
        }
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FhirVersion)) {
            return false;
        }
        FhirVersion fhirVersion = (FhirVersion) other;
        return this.major == fhirVersion.major && this.minor == fhirVersion.minor && this.patch == fhirVersion.patch;
    }

    public int hashCode() {
        return (((this.major * 31) + this.minor) * 31) + this.patch;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this)) + g4.k + this.major + FilenameUtils.EXTENSION_SEPARATOR + this.minor + FilenameUtils.EXTENSION_SEPARATOR + this.patch + g4.l;
    }

    public final boolean isSupportedFhirVersion() {
        return ((Boolean) FeatureUtilsKt.withPhrFeatureCheck(zcv.b(getClass()), "isSupportedFhirVersion", new Function0<Boolean>() { // from class: androidx.health.connect.client.records.FhirVersion.isSupportedFhirVersion.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(FhirVersion.this.getPlatformFhirVersion().isSupportedFhirVersion());
            }

            {
                super(0);
            }
        })).booleanValue();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/health/connect/client/records/FhirVersion$Companion;", "", "<init>", "()V", "VERSION_REGEX", "Lkotlin/text/Regex;", "parseFhirVersion", "Landroidx/health/connect/client/records/FhirVersion;", "fhirVersionString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final FhirVersion parseFhirVersion(String fhirVersionString) {
            zcp.c(fhirVersionString, "");
            MatchResult matchResultB = zeu.b(FhirVersion.VERSION_REGEX, fhirVersionString, 0, 2, null);
            if (matchResultB == null) {
                throw new IllegalArgumentException(("Invalid FHIR version string: " + fhirVersionString).toString());
            }
            return new FhirVersion(Integer.parseInt(matchResultB.getGroupValues().get(1)), Integer.parseInt(matchResultB.getGroupValues().get(2)), Integer.parseInt(matchResultB.getGroupValues().get(3)));
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    @JvmStatic
    public static final FhirVersion parseFhirVersion(String str) {
        return INSTANCE.parseFhirVersion(str);
    }
}
