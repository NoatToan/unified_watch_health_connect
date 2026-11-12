package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.App;
import com.huawei.openalliance.ad.beans.metadata.FlowControl;
import com.huawei.openalliance.ad.beans.metadata.Location;
import com.huawei.openalliance.ad.beans.metadata.OaidRecord;
import com.huawei.openalliance.ad.beans.server.AppConfigRsp;
import com.huawei.openalliance.ad.beans.tags.TagCfgModel;
import com.huawei.openalliance.ad.constant.AdLoadMode;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public interface gk extends fy {
    int A(String str);

    int B(String str);

    void C(String str);

    void D(String str);

    void E(String str);

    String a();

    String a(Context context, String str);

    void a(Location location);

    void a(String str, long j);

    void a(String str, FlowControl flowControl);

    void a(String str, OaidRecord oaidRecord);

    void a(String str, AppConfigRsp appConfigRsp, boolean z);

    void a(String str, boolean z);

    void a(List<String> list, Map<String, Boolean> map);

    void a(Map<String, String> map);

    void a(Set<String> set);

    void a(boolean z);

    boolean a(Long l);

    List<String> aJ();

    String aK();

    String aL();

    String aM();

    int aN();

    int aO();

    long aP();

    int aQ();

    int aR();

    AdLoadMode aS();

    int aT();

    long aU();

    long aV();

    boolean aX();

    int aZ();

    void b(int i);

    void b(long j);

    void b(List<String> list);

    void b(Set<String> set);

    void b(boolean z);

    int bA();

    int bB();

    int bC();

    int bD();

    Set<String> bE();

    int bF();

    String bG();

    boolean bH();

    long bI();

    long bJ();

    long bK();

    long bL();

    long bM();

    boolean bN();

    Set<String> bO();

    int bP();

    String bQ();

    float bR();

    int bS();

    int bT();

    Long bU();

    Long bV();

    int bW();

    int bX();

    long bY();

    String bZ();

    long ba();

    long bb();

    int bc();

    int bd();

    String be();

    boolean bf();

    boolean bg();

    String bh();

    long bi();

    String bj();

    String bk();

    boolean bl();

    boolean bm();

    int bn();

    long bo();

    int bp();

    int bq();

    int br();

    int bs();

    int bt();

    boolean bu();

    boolean bv();

    boolean bw();

    String bx();

    boolean by();

    boolean bz();

    String c(String str);

    void c(int i);

    void c(long j);

    void c(List<String> list);

    void c(boolean z);

    long cA();

    int cB();

    int cC();

    String cD();

    long cE();

    List<TagCfgModel> cF();

    long cG();

    long cH();

    String cI();

    long cJ();

    String cK();

    long cL();

    long cM();

    String cN();

    boolean cO();

    boolean cP();

    List<String> cQ();

    long ca();

    List<App> cb();

    String cc();

    boolean cd();

    boolean ce();

    String cf();

    String cg();

    Location ch();

    int ci();

    int cj();

    boolean ck();

    int cl();

    int cm();

    int cn();

    long co();

    long cp();

    int cq();

    int cr();

    boolean cs();

    String cu();

    String cv();

    boolean cw();

    long cx();

    Set<String> cy();

    boolean cz();

    int d();

    String d(String str);

    void d(int i);

    void d(long j);

    void d(boolean z);

    int e();

    void e(int i);

    void e(long j);

    void e(String str);

    void e(boolean z);

    long f(int i);

    void f(long j);

    void f(String str);

    void f(boolean z);

    void g(int i);

    void g(long j);

    void g(String str);

    void g(boolean z);

    void h(int i);

    void h(long j);

    void h(String str);

    void h(boolean z);

    void i(int i);

    void i(long j);

    boolean i(String str);

    void j(int i);

    void j(long j);

    boolean j(String str);

    Boolean k(String str);

    void k(int i);

    void k(long j);

    long l(String str);

    void l(int i);

    void l(long j);

    void m(int i);

    void m(long j);

    void m(String str);

    void n(long j);

    void n(String str);

    void o(long j);

    void o(String str);

    void p(long j);

    void p(String str);

    OaidRecord q(String str);

    void q(long j);

    void r(long j);

    void r(String str);

    void s(long j);

    void s(String str);

    void t(String str);

    FlowControl u(String str);

    void v(String str);

    int w(String str);

    void x(String str);

    void y(String str);

    boolean z(String str);
}
