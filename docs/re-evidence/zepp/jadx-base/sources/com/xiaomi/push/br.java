package com.xiaomi.push;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class br implements ce {
    public static boolean a = false;
    private bt c;
    private SimpleDateFormat b = new SimpleDateFormat("hh:mm:ss aaa");
    private a d = null;
    private a e = null;
    private bv f = null;
    private final String g = "[Slim] ";

    public class a implements bx, cf {
        public String a;
        private boolean b;

        public a(boolean z) {
            this.b = true;
            this.b = z;
            this.a = z ? " RCV " : " Sent ";
        }

        @Override // com.xiaomi.push.bx
        public void a(bi biVar) {
            StringBuilder sb;
            String string;
            if (br.a) {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(br.this.b.format(new Date()));
                sb.append(this.a);
                string = biVar.toString();
            } else {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(br.this.b.format(new Date()));
                sb.append(this.a);
                sb.append(" Blob [");
                sb.append(biVar.m3595a());
                sb.append(",");
                sb.append(biVar.a());
                sb.append(",");
                sb.append(com.xiaomi.push.service.aw.a(biVar.e()));
                string = "]";
            }
            sb.append(string);
            com.xiaomi.channel.commonutils.logger.b.c(sb.toString());
            if (biVar == null || biVar.a() != 99999) {
                return;
            }
            String strM3595a = biVar.m3595a();
            bi biVar2 = null;
            if (!this.b) {
                if ("BIND".equals(strM3595a)) {
                    com.xiaomi.channel.commonutils.logger.b.m3434a("build binded result for loopback.");
                    au.d dVar = new au.d();
                    dVar.a(true);
                    dVar.c("login success.");
                    dVar.b("success");
                    dVar.a("success");
                    bi biVar3 = new bi();
                    biVar3.a(dVar.m3755a(), (String) null);
                    biVar3.a((short) 2);
                    biVar3.a(99999);
                    biVar3.a("BIND", (String) null);
                    biVar3.a(biVar.e());
                    biVar3.b((String) null);
                    biVar3.c(biVar.g());
                    biVar2 = biVar3;
                } else if (!"UBND".equals(strM3595a) && "SECMSG".equals(strM3595a)) {
                    bi biVar4 = new bi();
                    biVar4.a(99999);
                    biVar4.a("SECMSG", (String) null);
                    biVar4.c(biVar.g());
                    biVar4.a(biVar.e());
                    biVar4.a(biVar.m3596a());
                    biVar4.b(biVar.f());
                    biVar4.a(biVar.m3599a(com.xiaomi.push.service.az.a().a(String.valueOf(99999), biVar.g()).h), (String) null);
                    biVar2 = biVar4;
                }
            }
            if (biVar2 != null) {
                for (Map.Entry<bx, bt.a> entry : br.this.c.m3607a().entrySet()) {
                    if (br.this.d != entry.getKey()) {
                        entry.getValue().a(biVar2);
                    }
                }
            }
        }

        @Override // com.xiaomi.push.bx
        public void a(cj cjVar) {
            StringBuilder sb;
            String strMo3639a;
            if (br.a) {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(br.this.b.format(new Date()));
                sb.append(this.a);
                sb.append(" PKT ");
                strMo3639a = cjVar.mo3639a();
            } else {
                sb = new StringBuilder();
                sb.append("[Slim] ");
                sb.append(br.this.b.format(new Date()));
                sb.append(this.a);
                sb.append(" PKT [");
                sb.append(cjVar.k());
                sb.append(",");
                sb.append(cjVar.j());
                strMo3639a = "]";
            }
            sb.append(strMo3639a);
            com.xiaomi.channel.commonutils.logger.b.c(sb.toString());
        }

        @Override // com.xiaomi.push.cf
        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean mo3604a(cj cjVar) {
            return true;
        }
    }

    public br(bt btVar) {
        this.c = null;
        this.c = btVar;
        d();
    }

    private void d() {
        this.d = new a(true);
        this.e = new a(false);
        bt btVar = this.c;
        a aVar = this.d;
        btVar.a(aVar, aVar);
        bt btVar2 = this.c;
        a aVar2 = this.e;
        btVar2.b(aVar2, aVar2);
        this.f = new h0(this);
    }
}
