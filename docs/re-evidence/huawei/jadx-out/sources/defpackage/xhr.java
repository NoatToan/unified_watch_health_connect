package defpackage;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import com.huawei.unitedevice.callback.IResultAIDLCallback;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.TransferFileQueueManager;
import com.huawei.unitedevice.hwcommonfilemgr.bean.Priority;
import java.io.BufferedOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class xhr {
    private int aa;
    private boolean ac;
    private long ad;
    private ParcelFileDescriptor ae;
    private String af;
    private Priority ag;
    private BufferedOutputStream ai;
    private long aj;
    private String ak;
    private String am;
    private long an;
    private String ap;
    private TransferFileQueueManager.TaskMode au;
    private TransferFileReqType aw;
    private long ax;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53010c;
    private int d;
    private List<Integer> e;
    private boolean g;
    private int i;
    private String k;
    private String l;
    private ByteBuffer n;
    private String o;
    private long q;
    private UniteDevice s;
    private int t;
    private int u;
    private String v;
    private long x;
    private long y;
    private String w = "";
    private boolean ah = true;
    private String ab = "";
    private long ar = -1;
    private int as = 0;
    private int al = 0;
    private int p = 0;
    private ITransferFileCallback m = null;
    private IResultAIDLCallback r = null;
    private ITransferFileCallback z = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f53009b = false;
    private boolean f = true;
    private int az = -1;
    private int ao = 0;
    private int aq = 0;
    private int av = 0;
    private int at = 0;
    private int bc = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53008a = 1;
    private boolean h = false;
    private volatile boolean j = false;

    public boolean at() {
        return this.j;
    }

    public void f(boolean z) {
        this.j = z;
    }

    public boolean au() {
        return this.h;
    }

    public void g(boolean z) {
        this.h = z;
    }

    public int as() {
        return this.bc;
    }

    public void o(int i) {
        this.bc = i;
    }

    public boolean aw() {
        return this.g;
    }

    public void d(boolean z) {
        this.g = z;
    }

    public ITransferFileCallback b() {
        return this.m;
    }

    public void b(ITransferFileCallback iTransferFileCallback) {
        this.m = iTransferFileCallback;
    }

    public long u() {
        return this.ad;
    }

    public void a(long j) {
        this.ad = j;
    }

    public long aq() {
        return this.ar;
    }

    public void g(long j) {
        this.ar = j;
    }

    public IResultAIDLCallback l() {
        return this.r;
    }

    public void e(IResultAIDLCallback iResultAIDLCallback) {
        this.r = iResultAIDLCallback;
    }

    public ITransferFileCallback p() {
        return this.z;
    }

    public void c(ITransferFileCallback iTransferFileCallback) {
        this.z = iTransferFileCallback;
    }

    public TransferFileReqType ac() {
        return this.aw;
    }

    public void a(TransferFileReqType transferFileReqType) {
        this.aw = transferFileReqType;
    }

    public List<Integer> c() {
        return this.e;
    }

    public void e(List<Integer> list) {
        this.e = list;
    }

    public int m() {
        return this.t;
    }

    public void a(int i) {
        this.t = i;
    }

    public String n() {
        return this.w;
    }

    public void c(String str) {
        this.w = str;
    }

    public int y() {
        return this.aa;
    }

    public void g(int i) {
        this.aa = i;
    }

    public String t() {
        return this.v;
    }

    public void d(String str) {
        this.v = str;
    }

    public boolean ax() {
        return this.ah;
    }

    public void a(boolean z) {
        this.ah = z;
    }

    public String x() {
        return this.ab;
    }

    public void f(String str) {
        this.ab = str;
    }

    public long s() {
        return this.x;
    }

    public void d(long j) {
        this.x = j;
    }

    public long o() {
        return this.q;
    }

    public void e(long j) {
        this.q = j;
    }

    public int r() {
        return this.u;
    }

    public void f(int i) {
        this.u = i;
    }

    public long q() {
        return this.y;
    }

    public void b(long j) {
        this.y = j;
    }

    public ByteBuffer a() {
        return this.n;
    }

    public void d(ByteBuffer byteBuffer) {
        this.n = byteBuffer;
    }

    public int ar() {
        return this.as;
    }

    public void m(int i) {
        this.as = i;
    }

    public int aj() {
        return this.al;
    }

    public void k(int i) {
        this.al = i;
    }

    public int k() {
        return this.p;
    }

    public void b(int i) {
        this.p = i;
    }

    public String ag() {
        return this.am;
    }

    public void g(String str) {
        this.am = str;
    }

    public String i() {
        return this.o;
    }

    public void a(String str) {
        this.o = str;
    }

    public String j() {
        return this.k;
    }

    public void b(String str) {
        this.k = str;
    }

    public int d() {
        return this.i;
    }

    public void d(int i) {
        this.i = i;
    }

    public void c(Priority priority) {
        this.ag = priority;
    }

    public long al() {
        return this.an;
    }

    public void j(long j) {
        this.an = j;
    }

    public long an() {
        return this.aj;
    }

    public void i(long j) {
        this.aj = j;
    }

    public ParcelFileDescriptor z() {
        return this.ae;
    }

    public void e(ParcelFileDescriptor parcelFileDescriptor) {
        this.ae = parcelFileDescriptor;
    }

    public String ah() {
        return this.af;
    }

    public void i(String str) {
        this.af = str;
    }

    public String ai() {
        return this.ak;
    }

    public void j(String str) {
        this.ak = str;
    }

    public String g() {
        return this.l;
    }

    public void e(String str) {
        this.l = str;
    }

    public boolean av() {
        return this.ac;
    }

    public void e(boolean z) {
        this.ac = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof xhr)) {
            return false;
        }
        xhr xhrVar = (xhr) obj;
        return y() == xhrVar.y() && TextUtils.equals(ag(), xhrVar.ag()) && TextUtils.equals(i(), xhrVar.i()) && TextUtils.equals(n(), xhrVar.n()) && f() == xhrVar.f();
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean ao() {
        return this.f53009b;
    }

    public void c(boolean z) {
        this.f53009b = z;
    }

    public String ab() {
        return this.ap;
    }

    public void h(String str) {
        this.ap = str;
    }

    public long ae() {
        return this.ax;
    }

    public void c(long j) {
        this.ax = j;
    }

    public void b(boolean z) {
        this.f = z;
    }

    public UniteDevice h() {
        return this.s;
    }

    public void c(UniteDevice uniteDevice) {
        this.s = uniteDevice;
    }

    public int v() {
        return this.f53010c;
    }

    public void j(int i) {
        this.f53010c = i;
    }

    public int f() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }

    public int ap() {
        return this.az;
    }

    public void p(int i) {
        this.az = i;
    }

    public int ad() {
        return this.ao;
    }

    public void h(int i) {
        this.ao = i;
    }

    public TransferFileQueueManager.TaskMode ak() {
        return this.au;
    }

    public void c(TransferFileQueueManager.TaskMode taskMode) {
        this.au = taskMode;
    }

    public int w() {
        return this.aq;
    }

    public void i(int i) {
        this.aq = i;
    }

    public int am() {
        return this.av;
    }

    public void l(int i) {
        this.av = i;
    }

    public BufferedOutputStream aa() {
        return this.ai;
    }

    public void c(BufferedOutputStream bufferedOutputStream) {
        this.ai = bufferedOutputStream;
    }

    public int af() {
        return this.at;
    }

    public void n(int i) {
        this.at = i;
    }

    public int e() {
        return this.f53008a;
    }

    public void e(int i) {
        this.f53008a = i;
    }
}
