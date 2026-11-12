package defpackage;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.hwdevice.phoneprocess.mgr.hwcommonfilemgr.bean.Priority;
import com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.IOTAResultAIDLCallback;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class mrk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42268a;
    private String aa;
    private ParcelFileDescriptor ab;
    private String ac;
    private Priority ad;
    private long af;
    private long ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f42269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer f42270c;
    private String g;
    private String h;
    private String i;
    private int k;
    private int n;
    private int o;
    private String p;
    private int q;
    private int s;
    private int t;
    private int u;
    private boolean x;
    private String z;
    private String l = "";
    private boolean y = true;
    private String w = "";
    private long ae = -1;
    private int ag = 0;
    private int ah = 0;
    private int j = 0;
    private IBaseCallback f = null;
    private IOTAResultAIDLCallback m = null;
    private IAppTransferFileResultAIDLCallback e = null;
    private ITransferSleepAndDFXFileCallback r = null;
    private IBaseCommonCallback v = null;
    private boolean d = false;
    private int aj = -1;

    public IBaseCallback a() {
        return this.f;
    }

    public void a(IBaseCallback iBaseCallback) {
        this.f = iBaseCallback;
    }

    public int p() {
        return this.q;
    }

    public void h(int i) {
        this.q = i;
    }

    public long ag() {
        return this.ae;
    }

    public void c(long j) {
        this.ae = j;
    }

    public IOTAResultAIDLCallback g() {
        return this.m;
    }

    public void b(IOTAResultAIDLCallback iOTAResultAIDLCallback) {
        this.m = iOTAResultAIDLCallback;
    }

    public IAppTransferFileResultAIDLCallback ah() {
        return this.e;
    }

    public void a(IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        this.e = iAppTransferFileResultAIDLCallback;
    }

    public ITransferSleepAndDFXFileCallback r() {
        return this.r;
    }

    public void c(ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) {
        this.r = iTransferSleepAndDFXFileCallback;
    }

    public int j() {
        return this.n;
    }

    public void a(int i) {
        this.n = i;
    }

    public String n() {
        return this.l;
    }

    public void b(String str) {
        this.l = str;
    }

    public int q() {
        return this.u;
    }

    public void f(int i) {
        this.u = i;
    }

    public String m() {
        return this.p;
    }

    public void c(String str) {
        this.p = str;
    }

    public boolean aj() {
        return this.y;
    }

    public void e(boolean z) {
        this.y = z;
    }

    public String t() {
        return this.w;
    }

    public void f(String str) {
        this.w = str;
    }

    public int l() {
        return this.o;
    }

    public void b(int i) {
        this.o = i;
    }

    public int k() {
        return this.k;
    }

    public void e(int i) {
        this.k = i;
    }

    public int o() {
        return this.t;
    }

    public void g(int i) {
        this.t = i;
    }

    public int s() {
        return this.s;
    }

    public void j(int i) {
        this.s = i;
    }

    public ByteBuffer d() {
        return this.f42270c;
    }

    public void c(ByteBuffer byteBuffer) {
        this.f42270c = byteBuffer;
    }

    public ByteBuffer b() {
        return this.f42269b;
    }

    public void a(ByteBuffer byteBuffer) {
        this.f42269b = byteBuffer;
    }

    public IBaseCommonCallback x() {
        return this.v;
    }

    public void d(IBaseCommonCallback iBaseCommonCallback) {
        this.v = iBaseCommonCallback;
    }

    public int z() {
        return this.ag;
    }

    public void k(int i) {
        this.ag = i;
    }

    public int ab() {
        return this.ah;
    }

    public void i(int i) {
        this.ah = i;
    }

    public int h() {
        return this.j;
    }

    public void c(int i) {
        this.j = i;
    }

    public String ac() {
        return this.z;
    }

    public void g(String str) {
        this.z = str;
    }

    public String f() {
        return this.i;
    }

    public void d(String str) {
        this.i = str;
    }

    public String e() {
        return this.h;
    }

    public void e(String str) {
        this.h = str;
    }

    public int c() {
        return this.f42268a;
    }

    public void d(int i) {
        this.f42268a = i;
    }

    public Priority y() {
        return this.ad;
    }

    public void c(Priority priority) {
        this.ad = priority;
    }

    public long aa() {
        return this.ai;
    }

    public void b(long j) {
        this.ai = j;
    }

    public long ad() {
        return this.af;
    }

    public void d(long j) {
        this.af = j;
    }

    public ParcelFileDescriptor u() {
        return this.ab;
    }

    public void a(ParcelFileDescriptor parcelFileDescriptor) {
        this.ab = parcelFileDescriptor;
    }

    public String w() {
        return this.aa;
    }

    public void j(String str) {
        this.aa = str;
    }

    public String v() {
        return this.ac;
    }

    public void i(String str) {
        this.ac = str;
    }

    public String i() {
        return this.g;
    }

    public void a(String str) {
        this.g = str;
    }

    public boolean af() {
        return this.x;
    }

    public void d(boolean z) {
        this.x = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mrk)) {
            return false;
        }
        mrk mrkVar = (mrk) obj;
        return q() == mrkVar.q() && TextUtils.equals(ac(), mrkVar.ac()) && TextUtils.equals(f(), mrkVar.f()) && TextUtils.equals(n(), mrkVar.n());
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean ai() {
        return this.d;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public int ae() {
        return this.aj;
    }

    public void m(int i) {
        this.aj = i;
    }
}
