package com.xiaomi.fitness.nfc.ui.debug;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.nfc.bean.NfcResponse;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.mri;
import defpackage.o0j;
import defpackage.ssg;
import defpackage.sui;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes9.dex */
public class SMXCardReaderActivity extends Activity {
    public static int i = 1;
    public ssg c;
    public ServerSocket f;
    public InputStream g;
    public OutputStream h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12553a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12554b = null;
    public int d = 0;
    public List<String> e = new ArrayList();

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.debug.SMXCardReaderActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0689a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ NfcResponse f12556a;

            public RunnableC0689a(NfcResponse nfcResponse) {
                this.f12556a = nfcResponse;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SMXCardReaderActivity.this.n()) {
                    return;
                }
                SMXCardReaderActivity sMXCardReaderActivity = SMXCardReaderActivity.this;
                NfcResponse nfcResponse = this.f12556a;
                sMXCardReaderActivity.u((nfcResponse == null || !nfcResponse.isSuccess()) ? 2 : 1);
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SMXCardReaderActivity.this.n()) {
                    return;
                }
                SMXCardReaderActivity.this.u(2);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                SMXCardReaderActivity.this.r(new RunnableC0689a(SMXCardReaderActivity.this.c.c(192, null)));
            } catch (Exception e) {
                e.printStackTrace();
                SMXCardReaderActivity.this.r(new b());
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                SMXCardReaderActivity.this.c.c(SportReportBaseParser.ReportType.divingOTU, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class c implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SMXCardReaderActivity.this.u(4);
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SMXCardReaderActivity.this.u(3);
            }
        }

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                SMXCardReaderActivity.this.f = new ServerSocket(8050);
                SMXCardReaderActivity.this.r(new a());
                SMXCardReaderActivity sMXCardReaderActivity = SMXCardReaderActivity.this;
                sMXCardReaderActivity.l(sMXCardReaderActivity.f.accept());
            } catch (Exception e) {
                e.printStackTrace();
                SMXCardReaderActivity.this.r(new b());
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SMXCardReaderActivity.this.u(5);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SMXCardReaderActivity.this.u(6);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SMXCardReaderActivity.this.j("Write apdu success!");
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SMXCardReaderActivity.this.j("Write apdu fail!");
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f12567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f12568b;

        public h(int i, byte[] bArr) {
            this.f12567a = i;
            this.f12568b = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f12567a;
            byte[] bArr = new byte[i];
            System.arraycopy(this.f12568b, 0, bArr, 0, i);
            SMXCardReaderActivity.this.j("Receive data::" + ByteUtil.byteToString(bArr));
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f12569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f12570b;
        public final /* synthetic */ int c;

        public i(int i, byte[] bArr, int i2) {
            this.f12569a = i;
            this.f12570b = bArr;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f12569a;
            byte[] bArr = new byte[i];
            System.arraycopy(this.f12570b, this.c, bArr, 0, i);
            SMXCardReaderActivity.this.j("Send data::" + ByteUtil.byteToString(bArr));
        }
    }

    public final void j(String str) {
        if (this.e.size() > 100) {
            this.e.remove(0);
        }
        this.e.add(str);
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.e.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("\n");
        }
        this.f12554b.setText(sb.toString());
    }

    public final void k() {
        new Thread(new b()).start();
        InputStream inputStream = this.g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        OutputStream outputStream = this.h;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        ServerSocket serverSocket = this.f;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
        finish();
    }

    public final void l(Socket socket) {
        r(new d());
        try {
            socket.setSoTimeout(120000);
            this.g = socket.getInputStream();
            this.h = socket.getOutputStream();
            while (!n()) {
                m();
            }
        } catch (Exception e2) {
            r(new e());
            e2.printStackTrace();
        }
    }

    public final void m() throws Exception {
        byte[] bArr = new byte[1024];
        byte[] bArr2 = new byte[4];
        int iS = s(bArr2, 4);
        if (bArr2[0] == 0 && bArr2[1] == 0 && bArr2[2] == 0 && bArr2[3] == 0) {
            iS = s(bArr2, 4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("exchangeAPDU length: ");
        sb.append(iS);
        if (iS != 4) {
            throw new IOException("bad data! haderDuffer = " + bArr2 + ",length=" + iS);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("receive header: ");
        sb2.append(ByteUtil.byteToString(bArr2));
        switch (bArr2[0]) {
            case 0:
                s(bArr, 1024);
                byte[] bArr3 = {-112, 0};
                StringBuilder sb3 = new StringBuilder();
                sb3.append("APDU response: ");
                sb3.append(ByteUtil.byteToString(bArr3));
                byte[] bArr4 = {bArr2[0], bArr2[1], (byte) 0, (byte) 2, 0, 0};
                System.arraycopy(bArr3, 0, bArr4, 4, 2);
                t(bArr4, 0, 4);
                t(bArr4, 4, 2);
                return;
            case 1:
                if (iS == 0) {
                    t(new byte[]{bArr2[0], bArr2[1], 0, 0}, 0, 4);
                    return;
                }
                int iS2 = s(bArr, 1024);
                if (iS2 == 0) {
                    throw new IOException("APDU cmd error");
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("send APDU .");
                sb4.append(ByteUtil.byteToString(bArr));
                byte[] bArr5 = new byte[iS2];
                System.arraycopy(bArr, 0, bArr5, 0, iS2);
                if (bArr5[0] == -124 && bArr5[1] == -28) {
                    int iNextInt = new Random().nextInt(1800) + 200;
                    if (i == 1) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("delete command, set HCI timeout to ");
                        sb5.append(iNextInt);
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("delete command, Toggle Value: ");
                        sb6.append(i);
                        i = 0;
                    } else {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("delete command, Toggle Value: ");
                        sb7.append(i);
                        i = 1;
                    }
                }
                NfcResponse nfcResponseC = this.c.c(SportReportBaseParser.ReportType.divingCNS, bArr5);
                if (!nfcResponseC.isSuccess()) {
                    r(new g());
                    throw new IOException("Write apdu fail!");
                }
                r(new f());
                byte[] bArr6 = nfcResponseC.mData;
                StringBuilder sb8 = new StringBuilder();
                sb8.append("APDU response: ");
                sb8.append(ByteUtil.byteToString(bArr6));
                int length = bArr6.length;
                byte[] bArr7 = new byte[length + 4];
                bArr7[0] = bArr2[0];
                bArr7[1] = bArr2[1];
                bArr7[2] = (byte) ((bArr6.length >> 8) & 255);
                bArr7[3] = (byte) (bArr6.length & 255);
                System.arraycopy(bArr6, 0, bArr7, 4, bArr6.length);
                t(bArr7, 0, 4);
                t(bArr7, 4, length);
                return;
            case 2:
                byte[] bArr8 = {bArr2[0], bArr2[1], (byte) 0, (byte) 4, 0, 0, 0, 4};
                StringBuilder sb9 = new StringBuilder();
                sb9.append("data response: ");
                sb9.append(ByteUtil.byteToString(bArr8));
                t(bArr8, 0, 4);
                t(bArr8, 4, 4);
                return;
            case 3:
                if (iS != 4 || bArr2[2] != 0 || bArr2[3] != 0) {
                    throw new IOException("bad cmd");
                }
                t(bArr, 0, iS);
                return;
            case 4:
                String str = new SimpleDateFormat(AppUtil.getApp().getString(o0j.S2)).format(new Date());
                int length2 = str.length() + 4;
                byte[] bArr9 = new byte[length2];
                bArr9[0] = bArr2[0];
                bArr9[1] = bArr2[1];
                bArr9[2] = (byte) ((str.length() >> 8) & 255);
                bArr9[3] = (byte) (str.length() & 255);
                System.arraycopy(str.getBytes(), 0, bArr9, 4, str.length());
                t(bArr9, 0, length2);
                return;
            case 5:
                if (s(bArr, 1024) <= 0) {
                    throw new IOException("JRCP_INIT_INFO cmd error");
                }
                t(bArr, 0, 4);
                return;
            case 6:
                int iS3 = s(bArr, 1024);
                if (iS3 <= 0) {
                    throw new IOException("JRCP_ECHO cmd error");
                }
                int i2 = iS3 - 4;
                byte[] bArr10 = new byte[i2];
                System.arraycopy(bArr, 0, bArr10, 4, i2);
                new String(bArr10);
                return;
            case 7:
                if (s(bArr, 1024) <= 0) {
                    throw new IOException("APDU cmd error");
                }
                t(new byte[]{bArr2[0], bArr2[1], 0, 0}, 0, 4);
                return;
            default:
                throw new IOException("bad cmd! cmd = " + ((int) bArr2[0]));
        }
    }

    public final boolean n() {
        return isFinishing() || isDestroyed();
    }

    public final /* synthetic */ void o(View view) {
        int i2 = this.d;
        if (i2 == 0 || i2 == 2) {
            this.f12553a.setEnabled(false);
            q();
        } else if (i2 != 3) {
            k();
        } else {
            this.f12553a.setEnabled(false);
            p();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(sui.b0);
        this.c = ssg.u();
        u(0);
        this.f12553a = (TextView) findViewById(mri.u4);
        this.f12554b = (TextView) findViewById(mri.C2);
        this.f12553a.setOnClickListener(new View.OnClickListener() { // from class: t7l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34423a.o(view);
            }
        });
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k();
    }

    public final void p() {
        new Thread(new c()).start();
    }

    public final void q() {
        new Thread(new a()).start();
    }

    public final void r(Runnable runnable) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        runOnUiThread(runnable);
    }

    public final int s(byte[] bArr, int i2) throws IOException {
        int i3 = this.g.read(bArr, 0, i2);
        if (i3 > 0) {
            r(new h(i3, bArr));
        }
        return i3;
    }

    public final void t(byte[] bArr, int i2, int i3) throws IOException {
        r(new i(i3, bArr, i2));
        this.h.write(bArr, i2, i3);
        this.h.flush();
    }

    public final void u(int i2) {
        this.d = i2;
        switch (i2) {
            case 1:
                j("SE opened!");
                p();
                this.f12553a.setText("Start");
                this.f12553a.setEnabled(false);
                break;
            case 2:
                j("SE open fail!");
                this.f12553a.setText("Start");
                this.f12553a.setEnabled(true);
                break;
            case 3:
                j("Socket open fail!");
                this.f12553a.setText("Open");
                this.f12553a.setEnabled(true);
                break;
            case 4:
                j("Socket open success wait for connect!");
                this.f12553a.setText("Open");
                this.f12553a.setEnabled(false);
                break;
            case 5:
                j("Socket client connect success! wait for data!");
                this.f12553a.setText(HTTP.CONN_CLOSE);
                this.f12553a.setEnabled(true);
                break;
            case 6:
                j("Socket read fail!");
                this.f12553a.setText(HTTP.CONN_CLOSE);
                this.f12553a.setEnabled(true);
                break;
        }
    }
}
