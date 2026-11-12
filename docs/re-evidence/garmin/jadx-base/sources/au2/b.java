package au2;

import e23.l;
import java.io.File;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "file", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/io/File;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class b extends w implements l<File, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<a.C0184a> f13057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f13059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List<a.C0184a> list, int i14, p0 p0Var, int i15) {
        super(1);
        this.f13057a = list;
        this.f13058b = i14;
        this.f13059c = p0Var;
        this.f13060d = i15;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // e23.l
    public final Boolean invoke(File file) {
        boolean z14;
        File file2 = file;
        if (this.f13057a.size() < this.f13058b) {
            if (file2.length() + ((long) this.f13059c.f105807a) <= this.f13060d) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }
}
