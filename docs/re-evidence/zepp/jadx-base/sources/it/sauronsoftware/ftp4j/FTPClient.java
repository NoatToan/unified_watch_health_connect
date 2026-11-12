package it.sauronsoftware.ftp4j;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import it.sauronsoftware.ftp4j.connectors.DirectConnector;
import it.sauronsoftware.ftp4j.extrecognizers.DefaultTextualExtensionRecognizer;
import it.sauronsoftware.ftp4j.listparsers.DOSListParser;
import it.sauronsoftware.ftp4j.listparsers.EPLFListParser;
import it.sauronsoftware.ftp4j.listparsers.MLSDListParser;
import it.sauronsoftware.ftp4j.listparsers.NetWareListParser;
import it.sauronsoftware.ftp4j.listparsers.UnixListParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes22.dex */
public class FTPClient {
    private static final int M = 65536;
    public static final int MLSD_ALWAYS = 1;
    public static final int MLSD_IF_SUPPORTED = 0;
    public static final int MLSD_NEVER = 2;
    private static final DateFormat N = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Pattern O = Pattern.compile("\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}");
    private static final Pattern P = Pattern.compile("\"/.*\"");
    public static final int SECURITY_FTP = 0;
    public static final int SECURITY_FTPES = 2;
    public static final int SECURITY_FTPS = 1;
    public static final int TYPE_AUTO = 0;
    public static final int TYPE_BINARY = 2;
    public static final int TYPE_TEXTUAL = 1;
    private String m;
    private String n;
    private c u;
    private long v;
    private int a = 65536;
    private int b = -1;
    private int c = -1;
    private FTPConnector d = new DirectConnector();
    private SSLSocketFactory e = (SSLSocketFactory) SSLSocketFactory.getDefault();
    private ArrayList f = new ArrayList();
    private ArrayList g = new ArrayList();
    private FTPTextualExtensionRecognizer h = DefaultTextualExtensionRecognizer.getInstance();
    private FTPListParser i = null;
    private String j = null;
    private int k = 0;
    private int l = 0;
    private boolean o = false;
    private boolean p = false;
    private boolean q = true;
    private int r = 0;
    private int s = 0;
    private long t = 0;
    private boolean w = false;
    private String x = null;
    private boolean y = false;
    private boolean z = false;
    private boolean A = false;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;
    private InputStream F = null;
    private OutputStream G = null;
    private boolean H = false;
    private boolean I = false;
    private Object J = new Object();
    private Object K = new Object();
    private FTPCommunicationChannel L = null;

    public class a extends it.sauronsoftware.ftp4j.b {
        public a() {
        }

        @Override // it.sauronsoftware.ftp4j.b, it.sauronsoftware.ftp4j.a
        public Socket a() throws FTPDataTransferException {
            Socket socketA = super.a();
            if (!FTPClient.this.D) {
                return socketA;
            }
            try {
                return FTPClient.this.r(socketA, socketA.getInetAddress().getHostName(), socketA.getPort());
            } catch (IOException e) {
                try {
                    socketA.close();
                } catch (Throwable unused) {
                }
                throw new FTPDataTransferException(e);
            }
        }
    }

    public class b implements it.sauronsoftware.ftp4j.a {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;

        public b(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // it.sauronsoftware.ftp4j.a
        public Socket a() throws FTPDataTransferException {
            try {
                String str = FTPClient.this.d.a() ? this.a : FTPClient.this.j;
                Socket socketConnectForDataTransferChannel = FTPClient.this.d.connectForDataTransferChannel(str, this.b);
                return FTPClient.this.D ? FTPClient.this.r(socketConnectForDataTransferChannel, str, this.b) : socketConnectForDataTransferChannel;
            } catch (IOException e) {
                throw new FTPDataTransferException("Cannot connect to the remote server", e);
            }
        }

        @Override // it.sauronsoftware.ftp4j.a
        public void dispose() {
        }
    }

    public class c extends Thread {
        private c() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (FTPClient.this.J) {
                if (FTPClient.this.v <= 0 && FTPClient.this.t > 0) {
                    FTPClient.this.v = System.currentTimeMillis() + FTPClient.this.t;
                }
                while (!Thread.interrupted() && FTPClient.this.t > 0) {
                    long jCurrentTimeMillis = FTPClient.this.v - System.currentTimeMillis();
                    if (jCurrentTimeMillis > 0) {
                        try {
                            FTPClient.this.J.wait(jCurrentTimeMillis);
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (System.currentTimeMillis() >= FTPClient.this.v) {
                        FTPClient.this.noop();
                    }
                }
            }
        }

        public /* synthetic */ c(FTPClient fTPClient, a aVar) {
            this();
        }
    }

    public FTPClient() {
        addListParser(new UnixListParser());
        addListParser(new DOSListParser());
        addListParser(new EPLFListParser());
        addListParser(new NetWareListParser());
        addListParser(new MLSDListParser());
    }

    private int i(String str) throws FTPException, FTPIllegalReplyException, IOException {
        int iLastIndexOf = str.lastIndexOf(46) + 1;
        int length = str.length();
        if (iLastIndexOf > 0 && iLastIndexOf < length - 1) {
            if (this.h.isTextualExt(str.substring(iLastIndexOf, length).toLowerCase())) {
                return 1;
            }
        }
        return 2;
    }

    private it.sauronsoftware.ftp4j.a j() throws FTPException, FTPDataTransferException, FTPIllegalReplyException, IOException {
        a aVar = new a();
        int iB = aVar.b();
        int[] iArrP = p();
        this.L.sendFTPCommand("PORT " + iArrP[0] + "," + iArrP[1] + "," + iArrP[2] + "," + iArrP[3] + "," + (iB >>> 8) + "," + (iB & 255));
        FTPReply fTPReply = this.L.readFTPReply();
        u();
        if (fTPReply.isSuccessCode()) {
            return aVar;
        }
        aVar.dispose();
        try {
            aVar.a().close();
        } catch (Throwable unused) {
        }
        throw new FTPException(fTPReply);
    }

    private it.sauronsoftware.ftp4j.a k() throws FTPException, FTPDataTransferException, FTPIllegalReplyException, IOException {
        if (this.B && this.y) {
            if (!this.C) {
                this.L.sendFTPCommand("MODE Z");
                FTPReply fTPReply = this.L.readFTPReply();
                u();
                if (fTPReply.isSuccessCode()) {
                    this.C = true;
                }
            }
        } else if (this.C) {
            this.L.sendFTPCommand("MODE S");
            FTPReply fTPReply2 = this.L.readFTPReply();
            u();
            if (fTPReply2.isSuccessCode()) {
                this.C = false;
            }
        }
        return this.q ? l() : j();
    }

    private it.sauronsoftware.ftp4j.a l() throws FTPException, FTPDataTransferException, FTPIllegalReplyException, IOException {
        this.L.sendFTPCommand("PASV");
        FTPReply fTPReply = this.L.readFTPReply();
        u();
        if (!fTPReply.isSuccessCode()) {
            throw new FTPException(fTPReply);
        }
        String strSubstring = null;
        String[] messages = fTPReply.getMessages();
        for (int i = 0; i < messages.length; i++) {
            Matcher matcher = O.matcher(messages[i]);
            if (matcher.find()) {
                strSubstring = messages[i].substring(matcher.start(), matcher.end());
                break;
            }
        }
        if (strSubstring == null) {
            throw new FTPIllegalReplyException();
        }
        StringTokenizer stringTokenizer = new StringTokenizer(strSubstring, ",");
        int i2 = Integer.parseInt(stringTokenizer.nextToken());
        int i3 = Integer.parseInt(stringTokenizer.nextToken());
        int i4 = Integer.parseInt(stringTokenizer.nextToken());
        int i5 = Integer.parseInt(stringTokenizer.nextToken());
        int i6 = Integer.parseInt(stringTokenizer.nextToken());
        return new b(i2 + "." + i3 + "." + i4 + "." + i5, Integer.parseInt(stringTokenizer.nextToken()) | (i6 << 8));
    }

    private int[] m() throws IOException {
        byte[] address = InetAddress.getLocalHost().getAddress();
        return new int[]{address[0] & 255, address[1] & 255, address[2] & 255, address[3] & 255};
    }

    private String n() {
        String str = this.x;
        if (str != null) {
            return str;
        }
        return this.z ? "UTF-8" : System.getProperty("file.encoding");
    }

    private int[] o() {
        String property = System.getProperty(it.sauronsoftware.ftp4j.c.b);
        int[] iArr = null;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            boolean z = false;
            if (stringTokenizer.countTokens() == 4) {
                int[] iArr2 = new int[4];
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        z = true;
                        break;
                    }
                    try {
                        iArr2[i] = Integer.parseInt(stringTokenizer.nextToken());
                    } catch (NumberFormatException unused) {
                        iArr2[i] = -1;
                    }
                    if (iArr2[i] < 0 || iArr2[i] > 255) {
                        break;
                    }
                    i++;
                }
                if (z) {
                    iArr = iArr2;
                }
            }
            if (!z) {
                System.err.println("WARNING: invalid value \"" + property + "\" for the " + it.sauronsoftware.ftp4j.c.b + " system property. The value should be in the x.x.x.x form.");
            }
        }
        return iArr;
    }

    private int[] p() throws IOException {
        int[] iArrO = o();
        return iArrO == null ? m() : iArrO;
    }

    private void q() throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        synchronized (this.J) {
            this.z = false;
            this.w = false;
            this.A = false;
            this.B = false;
            this.D = false;
            this.L.sendFTPCommand("FEAT");
            FTPReply fTPReply = this.L.readFTPReply();
            if (fTPReply.getCode() == 211) {
                String[] messages = fTPReply.getMessages();
                for (int i = 1; i < messages.length - 1; i++) {
                    String upperCase = messages[i].trim().toUpperCase();
                    if ("REST STREAM".equalsIgnoreCase(upperCase)) {
                        this.w = true;
                    } else if (UrlUtils.UTF8.equalsIgnoreCase(upperCase)) {
                        this.z = true;
                        this.L.changeCharset("UTF-8");
                    } else if ("MLSD".equalsIgnoreCase(upperCase)) {
                        this.A = true;
                    } else if ("MODE Z".equalsIgnoreCase(upperCase) || upperCase.startsWith("MODE Z ")) {
                        this.B = true;
                    }
                }
            }
            if (this.z) {
                this.L.sendFTPCommand("OPTS UTF8 ON");
                this.L.readFTPReply();
            }
            int i2 = this.l;
            if (i2 == 1 || i2 == 2) {
                this.L.sendFTPCommand("PBSZ 0");
                this.L.readFTPReply();
                this.L.sendFTPCommand("PROT P");
                if (this.L.readFTPReply().isSuccessCode()) {
                    this.D = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Socket r(Socket socket, String str, int i) throws IOException {
        return this.e.createSocket(socket, str, i, true);
    }

    private void s() {
        if (this.t > 0) {
            c cVar = new c(this, null);
            this.u = cVar;
            cVar.start();
        }
    }

    private void t() {
        c cVar = this.u;
        if (cVar != null) {
            cVar.interrupt();
            this.u = null;
        }
    }

    private void u() {
        if (this.u != null) {
            this.v = System.currentTimeMillis() + this.t;
        }
    }

    public void abortCurrentConnectionAttempt() {
        this.d.abortConnectForCommunicationChannel();
    }

    public void abortCurrentDataTransfer(boolean z) throws FTPIllegalReplyException, IOException {
        synchronized (this.K) {
            if (this.E && !this.H) {
                if (z) {
                    this.L.sendFTPCommand("ABOR");
                    u();
                    this.I = true;
                }
                InputStream inputStream = this.F;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused) {
                    }
                }
                OutputStream outputStream = this.G;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                this.H = true;
            }
        }
    }

    public void abruptlyCloseCommunication() {
        FTPCommunicationChannel fTPCommunicationChannel = this.L;
        if (fTPCommunicationChannel != null) {
            fTPCommunicationChannel.close();
            this.L = null;
        }
        this.o = false;
        t();
    }

    public void addCommunicationListener(FTPCommunicationListener fTPCommunicationListener) {
        synchronized (this.J) {
            this.f.add(fTPCommunicationListener);
            FTPCommunicationChannel fTPCommunicationChannel = this.L;
            if (fTPCommunicationChannel != null) {
                fTPCommunicationChannel.addCommunicationListener(fTPCommunicationListener);
            }
        }
    }

    public void addListParser(FTPListParser fTPListParser) {
        synchronized (this.J) {
            this.g.add(fTPListParser);
        }
    }

    public void append(File file) throws IllegalStateException, FTPException, FTPDataTransferException, FTPIllegalReplyException, FTPAbortedException, IOException {
        append(file, null);
    }

    public void changeAccount(String str) throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.p) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.L.sendFTPCommand("ACCT " + str);
            FTPReply fTPReply = this.L.readFTPReply();
            u();
            if (!fTPReply.isSuccessCode()) {
                throw new FTPException(fTPReply);
            }
        }
    }

    public void changeDirectory(String str) throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.p) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.L.sendFTPCommand("CWD " + str);
            FTPReply fTPReply = this.L.readFTPReply();
            u();
            if (!fTPReply.isSuccessCode()) {
                throw new FTPException(fTPReply);
            }
        }
    }

    public void changeDirectoryUp() throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.p) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.L.sendFTPCommand("CDUP");
            FTPReply fTPReply = this.L.readFTPReply();
            u();
            if (!fTPReply.isSuccessCode()) {
                throw new FTPException(fTPReply);
            }
        }
    }

    public String[] connect(String str) throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        return connect(str, this.l == 1 ? 990 : 21);
    }

    public void createDirectory(String str) throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.p) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.L.sendFTPCommand("MKD " + str);
            FTPReply fTPReply = this.L.readFTPReply();
            u();
            if (!fTPReply.isSuccessCode()) {
                throw new FTPException(fTPReply);
            }
        }
    }

    public String currentDirectory() throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        String strSubstring;
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.p) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.L.sendFTPCommand("PWD");
            FTPReply fTPReply = this.L.readFTPReply();
            u();
            if (!fTPReply.isSuccessCode()) {
                throw new FTPException(fTPReply);
            }
            String[] messages = fTPReply.getMessages();
            if (messages.length != 1) {
                throw new FTPIllegalReplyException();
            }
            Matcher matcher = P.matcher(messages[0]);
            if (!matcher.find()) {
                throw new FTPIllegalReplyException();
            }
            strSubstring = messages[0].substring(matcher.start() + 1, matcher.end() - 1);
        }
        return strSubstring;
    }

    public void deleteDirectory(String str) throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.p) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.L.sendFTPCommand("RMD " + str);
            FTPReply fTPReply = this.L.readFTPReply();
            u();
            if (!fTPReply.isSuccessCode()) {
                throw new FTPException(fTPReply);
            }
        }
    }

    public void deleteFile(String str) throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.p) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.L.sendFTPCommand("DELE " + str);
            FTPReply fTPReply = this.L.readFTPReply();
            u();
            if (!fTPReply.isSuccessCode()) {
                throw new FTPException(fTPReply);
            }
        }
    }

    public void disconnect(boolean z) throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (this.p) {
                t();
            }
            if (z) {
                this.L.sendFTPCommand("QUIT");
                FTPReply fTPReply = this.L.readFTPReply();
                if (!fTPReply.isSuccessCode()) {
                    throw new FTPException(fTPReply);
                }
            }
            this.L.close();
            this.L = null;
            this.o = false;
        }
    }

    public void download(String str, File file) throws IllegalStateException, FTPException, FTPDataTransferException, FTPIllegalReplyException, FTPAbortedException, IOException {
        download(str, file, 0L, (FTPDataTransferListener) null);
    }

    public long fileSize(String str) throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        long j;
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.p) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.L.sendFTPCommand("TYPE I");
            FTPReply fTPReply = this.L.readFTPReply();
            u();
            if (!fTPReply.isSuccessCode()) {
                throw new FTPException(fTPReply);
            }
            this.L.sendFTPCommand("SIZE " + str);
            FTPReply fTPReply2 = this.L.readFTPReply();
            u();
            if (!fTPReply2.isSuccessCode()) {
                throw new FTPException(fTPReply2);
            }
            String[] messages = fTPReply2.getMessages();
            if (messages.length != 1) {
                throw new FTPIllegalReplyException();
            }
            try {
                j = Long.parseLong(messages[0]);
            } catch (Throwable unused) {
                throw new FTPIllegalReplyException();
            }
        }
        return j;
    }

    public long getAutoNoopTimeout() {
        long j;
        synchronized (this.J) {
            j = this.t;
        }
        return j;
    }

    public String getCharset() {
        String str;
        synchronized (this.J) {
            str = this.x;
        }
        return str;
    }

    public FTPCommunicationListener[] getCommunicationListeners() {
        FTPCommunicationListener[] fTPCommunicationListenerArr;
        synchronized (this.J) {
            int size = this.f.size();
            fTPCommunicationListenerArr = new FTPCommunicationListener[size];
            for (int i = 0; i < size; i++) {
                fTPCommunicationListenerArr[i] = (FTPCommunicationListener) this.f.get(i);
            }
        }
        return fTPCommunicationListenerArr;
    }

    public FTPConnector getConnector() {
        FTPConnector fTPConnector;
        synchronized (this.J) {
            fTPConnector = this.d;
        }
        return fTPConnector;
    }

    public String getHost() {
        String str;
        synchronized (this.J) {
            str = this.j;
        }
        return str;
    }

    public FTPListParser[] getListParsers() {
        FTPListParser[] fTPListParserArr;
        synchronized (this.J) {
            int size = this.g.size();
            fTPListParserArr = new FTPListParser[size];
            for (int i = 0; i < size; i++) {
                fTPListParserArr[i] = (FTPListParser) this.g.get(i);
            }
        }
        return fTPListParserArr;
    }

    public int getMLSDPolicy() {
        int i;
        synchronized (this.J) {
            i = this.s;
        }
        return i;
    }

    public String getPassword() {
        String str;
        synchronized (this.J) {
            str = this.n;
        }
        return str;
    }

    public int getPort() {
        int i;
        synchronized (this.J) {
            i = this.k;
        }
        return i;
    }

    public SSLSocketFactory getSSLSocketFactory() {
        SSLSocketFactory sSLSocketFactory;
        synchronized (this.J) {
            sSLSocketFactory = this.e;
        }
        return sSLSocketFactory;
    }

    public int getSecurity() {
        return this.l;
    }

    public FTPTextualExtensionRecognizer getTextualExtensionRecognizer() {
        FTPTextualExtensionRecognizer fTPTextualExtensionRecognizer;
        synchronized (this.J) {
            fTPTextualExtensionRecognizer = this.h;
        }
        return fTPTextualExtensionRecognizer;
    }

    public int getType() {
        int i;
        synchronized (this.J) {
            i = this.r;
        }
        return i;
    }

    public String getUsername() {
        String str;
        synchronized (this.J) {
            str = this.m;
        }
        return str;
    }

    public String[] help() throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        String[] messages;
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.p) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.L.sendFTPCommand("HELP");
            FTPReply fTPReply = this.L.readFTPReply();
            u();
            if (!fTPReply.isSuccessCode()) {
                throw new FTPException(fTPReply);
            }
            messages = fTPReply.getMessages();
        }
        return messages;
    }

    public boolean isAuthenticated() {
        boolean z;
        synchronized (this.J) {
            z = this.p;
        }
        return z;
    }

    public boolean isCompressionEnabled() {
        return this.y;
    }

    public boolean isCompressionSupported() {
        return this.B;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.J) {
            z = this.o;
        }
        return z;
    }

    public boolean isPassive() {
        boolean z;
        synchronized (this.J) {
            z = this.q;
        }
        return z;
    }

    public boolean isResumeSupported() {
        boolean z;
        synchronized (this.J) {
            z = this.w;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:175:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [it.sauronsoftware.ftp4j.d] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8, types: [it.sauronsoftware.ftp4j.d] */
    public FTPFile[] list(String str) throws IllegalStateException, FTPException, FTPDataTransferException, FTPIllegalReplyException, FTPAbortedException, FTPListParseException, IOException {
        Socket socketA;
        FTPFile[] fTPFileArr;
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.p) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.L.sendFTPCommand("TYPE A");
            FTPReply fTPReply = this.L.readFTPReply();
            u();
            if (!fTPReply.isSuccessCode()) {
                throw new FTPException(fTPReply);
            }
            it.sauronsoftware.ftp4j.a aVarK = k();
            int i = this.s;
            ?? dVar = 1;
            boolean z = i == 0 ? this.A : i == 1;
            String str2 = z ? "MLSD" : "LIST";
            if (str != null && str.length() > 0) {
                str2 = str2 + " " + str;
            }
            ArrayList arrayList = new ArrayList();
            this.L.sendFTPCommand(str2);
            try {
                try {
                    socketA = aVarK.a();
                    aVarK.dispose();
                    synchronized (this.K) {
                        this.E = true;
                        this.H = false;
                        this.I = false;
                    }
                    FTPFile[] fTPFileArr2 = null;
                    try {
                        try {
                            try {
                                this.F = socketA.getInputStream();
                                if (this.C) {
                                    this.F = new InflaterInputStream(this.F);
                                }
                                dVar = new d(this.F, z ? "UTF-8" : n());
                                while (true) {
                                    try {
                                        String strB = dVar.b();
                                        if (strB == null) {
                                            try {
                                                break;
                                            } catch (Throwable unused) {
                                            }
                                        } else if (strB.length() > 0) {
                                            arrayList.add(strB);
                                        }
                                    } catch (IOException e) {
                                        e = e;
                                        synchronized (this.K) {
                                            if (this.H) {
                                                throw new FTPAbortedException();
                                            }
                                            throw new FTPDataTransferException("I/O error in data transfer", e);
                                        }
                                    }
                                }
                                dVar.close();
                                try {
                                    socketA.close();
                                } catch (Throwable unused2) {
                                }
                                this.F = null;
                                try {
                                    synchronized (this.K) {
                                        try {
                                            boolean z2 = this.H;
                                            this.E = false;
                                            this.H = false;
                                            FTPReply fTPReply2 = this.L.readFTPReply();
                                            u();
                                            if (fTPReply2.getCode() != 150 && fTPReply2.getCode() != 125) {
                                                throw new FTPException(fTPReply2);
                                            }
                                            FTPReply fTPReply3 = this.L.readFTPReply();
                                            if (!z2 && fTPReply3.getCode() != 226) {
                                                throw new FTPException(fTPReply3);
                                            }
                                            if (this.I) {
                                                this.L.readFTPReply();
                                                this.I = false;
                                            }
                                            int size = arrayList.size();
                                            String[] strArr = new String[size];
                                            for (int i2 = 0; i2 < size; i2++) {
                                                strArr[i2] = (String) arrayList.get(i2);
                                            }
                                            if (z) {
                                                fTPFileArr = new MLSDListParser().parse(strArr);
                                            } else {
                                                FTPListParser fTPListParser = this.i;
                                                if (fTPListParser != null) {
                                                    try {
                                                        fTPFileArr2 = fTPListParser.parse(strArr);
                                                    } catch (FTPListParseException unused3) {
                                                        this.i = null;
                                                    }
                                                }
                                                if (fTPFileArr2 == null) {
                                                    for (FTPListParser fTPListParser2 : this.g) {
                                                        try {
                                                            fTPFileArr2 = fTPListParser2.parse(strArr);
                                                            this.i = fTPListParser2;
                                                            break;
                                                        } catch (FTPListParseException unused4) {
                                                        }
                                                    }
                                                }
                                                fTPFileArr = fTPFileArr2;
                                            }
                                            if (fTPFileArr == null) {
                                                throw new FTPListParseException();
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                FTPReply fTPReply4 = this.L.readFTPReply();
                                u();
                                if (fTPReply4.getCode() != 150 && fTPReply4.getCode() != 125) {
                                    throw new FTPException(fTPReply4);
                                }
                                FTPReply fTPReply5 = this.L.readFTPReply();
                                if (socketA == null && fTPReply5.getCode() != 226) {
                                    throw new FTPException(fTPReply5);
                                }
                                if (this.I) {
                                    this.L.readFTPReply();
                                    this.I = false;
                                }
                                throw th;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            dVar = 0;
                        } catch (Throwable th4) {
                            th = th4;
                            dVar = 0;
                            if (dVar != 0) {
                                try {
                                    dVar.close();
                                } catch (Throwable unused5) {
                                }
                            }
                            try {
                                socketA.close();
                            } catch (Throwable unused6) {
                            }
                            this.F = null;
                            try {
                                synchronized (this.K) {
                                    try {
                                        boolean z3 = this.H;
                                        this.E = false;
                                        this.H = false;
                                        throw th;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        if (dVar != 0) {
                            dVar.close();
                        }
                        socketA.close();
                        this.F = null;
                        synchronized (this.K) {
                            boolean z4 = this.H;
                            this.E = false;
                            this.H = false;
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    socketA = null;
                }
            } catch (Throwable th9) {
                aVarK.dispose();
                throw th9;
            }
        }
        return fTPFileArr;
    }

    public String[] listNames() throws IllegalStateException, FTPException, FTPDataTransferException, FTPIllegalReplyException, FTPAbortedException, FTPListParseException, IOException {
        Socket socketA;
        d dVar;
        String[] strArr;
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.p) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.L.sendFTPCommand("TYPE A");
            FTPReply fTPReply = this.L.readFTPReply();
            u();
            if (!fTPReply.isSuccessCode()) {
                throw new FTPException(fTPReply);
            }
            ArrayList arrayList = new ArrayList();
            it.sauronsoftware.ftp4j.a aVarK = k();
            this.L.sendFTPCommand("NLST");
            try {
                try {
                    socketA = aVarK.a();
                    aVarK.dispose();
                    synchronized (this.K) {
                        this.E = true;
                        this.H = false;
                        this.I = false;
                    }
                    try {
                        try {
                            this.F = socketA.getInputStream();
                            if (this.C) {
                                this.F = new InflaterInputStream(this.F);
                            }
                            dVar = new d(this.F, n());
                            while (true) {
                                try {
                                    try {
                                        String strB = dVar.b();
                                        if (strB == null) {
                                            try {
                                                break;
                                            } catch (Throwable unused) {
                                            }
                                        } else if (strB.length() > 0) {
                                            arrayList.add(strB);
                                        }
                                    } catch (IOException e) {
                                        e = e;
                                        synchronized (this.K) {
                                            if (this.H) {
                                                throw new FTPAbortedException();
                                            }
                                            throw new FTPDataTransferException("I/O error in data transfer", e);
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                                th = th;
                                if (dVar != null) {
                                    try {
                                        dVar.close();
                                    } catch (Throwable unused2) {
                                    }
                                }
                                try {
                                    socketA.close();
                                } catch (Throwable unused3) {
                                }
                                this.F = null;
                                try {
                                    synchronized (this.K) {
                                        try {
                                            boolean z = this.H;
                                            this.E = false;
                                            this.H = false;
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            dVar.close();
                            try {
                                socketA.close();
                            } catch (Throwable unused4) {
                            }
                            this.F = null;
                            try {
                                synchronized (this.K) {
                                    try {
                                        boolean z2 = this.H;
                                        this.E = false;
                                        this.H = false;
                                        FTPReply fTPReply2 = this.L.readFTPReply();
                                        if (fTPReply2.getCode() != 150 && fTPReply2.getCode() != 125) {
                                            throw new FTPException(fTPReply2);
                                        }
                                        FTPReply fTPReply3 = this.L.readFTPReply();
                                        if (!z2 && fTPReply3.getCode() != 226) {
                                            throw new FTPException(fTPReply3);
                                        }
                                        if (this.I) {
                                            this.L.readFTPReply();
                                            this.I = false;
                                        }
                                        int size = arrayList.size();
                                        strArr = new String[size];
                                        for (int i = 0; i < size; i++) {
                                            strArr[i] = (String) arrayList.get(i);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            FTPReply fTPReply4 = this.L.readFTPReply();
                            if (fTPReply4.getCode() != 150 && fTPReply4.getCode() != 125) {
                                throw new FTPException(fTPReply4);
                            }
                            FTPReply fTPReply5 = this.L.readFTPReply();
                            if (socketA == null && fTPReply5.getCode() != 226) {
                                throw new FTPException(fTPReply5);
                            }
                            if (this.I) {
                                this.L.readFTPReply();
                                this.I = false;
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        dVar = null;
                    } catch (Throwable th7) {
                        th = th7;
                        dVar = null;
                    }
                } catch (Throwable th8) {
                    aVarK.dispose();
                    throw th8;
                }
            } catch (Throwable th9) {
                th = th9;
                socketA = null;
            }
        }
        return strArr;
    }

    public void login(String str, String str2) throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        login(str, str2, null);
    }

    public void logout() throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.p) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.L.sendFTPCommand("REIN");
            FTPReply fTPReply = this.L.readFTPReply();
            if (!fTPReply.isSuccessCode()) {
                throw new FTPException(fTPReply);
            }
            t();
            this.p = false;
            this.m = null;
            this.n = null;
        }
    }

    public Date modifiedDate(String str) throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        Date date;
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.p) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.L.sendFTPCommand("MDTM " + str);
            FTPReply fTPReply = this.L.readFTPReply();
            u();
            if (!fTPReply.isSuccessCode()) {
                throw new FTPException(fTPReply);
            }
            String[] messages = fTPReply.getMessages();
            if (messages.length != 1) {
                throw new FTPIllegalReplyException();
            }
            try {
                date = N.parse(messages[0]);
            } catch (ParseException unused) {
                throw new FTPIllegalReplyException();
            }
        }
        return date;
    }

    public void noop() throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.p) {
                throw new IllegalStateException("Client not authenticated");
            }
            try {
                this.L.sendFTPCommand("NOOP");
                FTPReply fTPReply = this.L.readFTPReply();
                if (!fTPReply.isSuccessCode()) {
                    throw new FTPException(fTPReply);
                }
                u();
            } catch (Throwable th) {
                u();
                throw th;
            }
        }
    }

    public void removeCommunicationListener(FTPCommunicationListener fTPCommunicationListener) {
        synchronized (this.J) {
            this.f.remove(fTPCommunicationListener);
            FTPCommunicationChannel fTPCommunicationChannel = this.L;
            if (fTPCommunicationChannel != null) {
                fTPCommunicationChannel.removeCommunicationListener(fTPCommunicationListener);
            }
        }
    }

    public void removeListParser(FTPListParser fTPListParser) {
        synchronized (this.J) {
            this.g.remove(fTPListParser);
        }
    }

    public void rename(String str, String str2) throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.p) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.L.sendFTPCommand("RNFR " + str);
            FTPReply fTPReply = this.L.readFTPReply();
            u();
            if (fTPReply.getCode() != 350) {
                throw new FTPException(fTPReply);
            }
            this.L.sendFTPCommand("RNTO " + str2);
            FTPReply fTPReply2 = this.L.readFTPReply();
            u();
            if (!fTPReply2.isSuccessCode()) {
                throw new FTPException(fTPReply2);
            }
        }
    }

    public FTPReply sendCustomCommand(String str) throws IllegalStateException, FTPIllegalReplyException, IOException {
        FTPReply fTPReply;
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            this.L.sendFTPCommand(str);
            u();
            fTPReply = this.L.readFTPReply();
        }
        return fTPReply;
    }

    public FTPReply sendSiteCommand(String str) throws IllegalStateException, FTPIllegalReplyException, IOException {
        FTPReply fTPReply;
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            this.L.sendFTPCommand("SITE " + str);
            u();
            fTPReply = this.L.readFTPReply();
        }
        return fTPReply;
    }

    public String[] serverStatus() throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        String[] messages;
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.p) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.L.sendFTPCommand("STAT");
            FTPReply fTPReply = this.L.readFTPReply();
            u();
            if (!fTPReply.isSuccessCode()) {
                throw new FTPException(fTPReply);
            }
            messages = fTPReply.getMessages();
        }
        return messages;
    }

    public void setAutoNoopTimeout(long j) {
        synchronized (this.J) {
            if (this.o && this.p) {
                t();
            }
            long j2 = this.t;
            this.t = j;
            if (j2 != 0 && j != 0) {
                long j3 = this.v;
                if (j3 > 0) {
                    this.v = j3 - (j2 - j);
                }
            }
            if (this.o && this.p) {
                s();
            }
        }
    }

    public void setBufferSize(int i) {
        this.a = i;
    }

    public void setCharset(String str) {
        synchronized (this.J) {
            this.x = str;
            if (this.o) {
                try {
                    this.L.changeCharset(n());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void setCompressionEnabled(boolean z) {
        this.y = z;
    }

    public void setConnector(FTPConnector fTPConnector) {
        synchronized (this.J) {
            this.d = fTPConnector;
        }
    }

    public void setDataReciveBufferSize(int i) {
        this.c = i;
    }

    public void setDataSendBufferSize(int i) {
        this.b = i;
    }

    public void setMLSDPolicy(int i) throws IllegalArgumentException {
        int i2 = this.r;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("Invalid MLSD policy");
        }
        synchronized (this.J) {
            this.s = i;
        }
    }

    public void setPassive(boolean z) {
        synchronized (this.J) {
            this.q = z;
        }
    }

    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        synchronized (this.J) {
            this.e = sSLSocketFactory;
        }
    }

    public void setSecurity(int i) throws IllegalStateException, IllegalArgumentException {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException("Invalid security");
        }
        synchronized (this.J) {
            if (this.o) {
                throw new IllegalStateException("The security level of the connection can't be changed while the client is connected");
            }
            this.l = i;
        }
    }

    public void setTextualExtensionRecognizer(FTPTextualExtensionRecognizer fTPTextualExtensionRecognizer) {
        synchronized (this.J) {
            this.h = fTPTextualExtensionRecognizer;
        }
    }

    public void setType(int i) throws IllegalArgumentException {
        if (i != 0 && i != 2 && i != 1) {
            throw new IllegalArgumentException("Invalid type");
        }
        synchronized (this.J) {
            this.r = i;
        }
    }

    public String toString() {
        String string;
        synchronized (this.J) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getClass().getName());
            stringBuffer.append(" [connected=");
            stringBuffer.append(this.o);
            if (this.o) {
                stringBuffer.append(", host=");
                stringBuffer.append(this.j);
                stringBuffer.append(", port=");
                stringBuffer.append(this.k);
            }
            stringBuffer.append(", connector=");
            stringBuffer.append(this.d);
            stringBuffer.append(", security=");
            int i = this.l;
            if (i == 0) {
                stringBuffer.append("SECURITY_FTP");
            } else if (i == 1) {
                stringBuffer.append("SECURITY_FTPS");
            } else if (i == 2) {
                stringBuffer.append("SECURITY_FTPES");
            }
            stringBuffer.append(", authenticated=");
            stringBuffer.append(this.p);
            if (this.p) {
                stringBuffer.append(", username=");
                stringBuffer.append(this.m);
                stringBuffer.append(", password=");
                StringBuffer stringBuffer2 = new StringBuffer();
                for (int i2 = 0; i2 < this.n.length(); i2++) {
                    stringBuffer2.append('*');
                }
                stringBuffer.append(stringBuffer2);
                stringBuffer.append(", restSupported=");
                stringBuffer.append(this.w);
                stringBuffer.append(", utf8supported=");
                stringBuffer.append(this.z);
                stringBuffer.append(", mlsdSupported=");
                stringBuffer.append(this.A);
                stringBuffer.append(", mode=modezSupported");
                stringBuffer.append(this.B);
                stringBuffer.append(", mode=modezEnabled");
                stringBuffer.append(this.C);
            }
            stringBuffer.append(", transfer mode=");
            stringBuffer.append(this.q ? "passive" : AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
            stringBuffer.append(", transfer type=");
            int i3 = this.r;
            if (i3 == 0) {
                stringBuffer.append("TYPE_AUTO");
            } else if (i3 == 1) {
                stringBuffer.append("TYPE_TEXTUAL");
            } else if (i3 == 2) {
                stringBuffer.append("TYPE_BINARY");
            }
            stringBuffer.append(", textualExtensionRecognizer=");
            stringBuffer.append(this.h);
            FTPListParser[] listParsers = getListParsers();
            if (listParsers.length > 0) {
                stringBuffer.append(", listParsers=");
                for (int i4 = 0; i4 < listParsers.length; i4++) {
                    if (i4 > 0) {
                        stringBuffer.append(", ");
                    }
                    stringBuffer.append(listParsers[i4]);
                }
            }
            FTPCommunicationListener[] communicationListeners = getCommunicationListeners();
            if (communicationListeners.length > 0) {
                stringBuffer.append(", communicationListeners=");
                for (int i5 = 0; i5 < communicationListeners.length; i5++) {
                    if (i5 > 0) {
                        stringBuffer.append(", ");
                    }
                    stringBuffer.append(communicationListeners[i5]);
                }
            }
            stringBuffer.append(", autoNoopTimeout=");
            stringBuffer.append(this.t);
            stringBuffer.append("]");
            string = stringBuffer.toString();
        }
        return string;
    }

    public void upload(File file) throws IllegalStateException, FTPException, FTPDataTransferException, FTPIllegalReplyException, FTPAbortedException, IOException {
        upload(file, 0L, null);
    }

    public void append(File file, FTPDataTransferListener fTPDataTransferListener) throws IllegalStateException, FTPException, FTPDataTransferException, FTPIllegalReplyException, FTPAbortedException, IOException {
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                try {
                    try {
                        try {
                            append(file.getName(), fileInputStream, 0L, fTPDataTransferListener);
                            try {
                                fileInputStream.close();
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable unused2) {
                            }
                            throw th;
                        }
                    } catch (FTPDataTransferException e) {
                        throw e;
                    } catch (FTPIllegalReplyException e2) {
                        throw e2;
                    }
                } catch (FTPException e3) {
                    throw e3;
                } catch (IOException e4) {
                    throw e4;
                }
            } catch (FTPAbortedException e5) {
                throw e5;
            } catch (IllegalStateException e6) {
                throw e6;
            }
        } catch (IOException e7) {
            throw new FTPDataTransferException(e7);
        }
    }

    public void download(String str, File file, FTPDataTransferListener fTPDataTransferListener) throws IllegalStateException, FTPException, FTPDataTransferException, FTPIllegalReplyException, FTPAbortedException, IOException {
        download(str, file, 0L, fTPDataTransferListener);
    }

    public void login(String str, String str2, String str3) throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        boolean z;
        synchronized (this.J) {
            if (!this.o) {
                throw new IllegalStateException("Client not connected");
            }
            if (this.l == 2) {
                this.L.sendFTPCommand("AUTH TLS");
                if (this.L.readFTPReply().isSuccessCode()) {
                    this.L.ssl(this.e);
                } else {
                    this.L.sendFTPCommand("AUTH SSL");
                    FTPReply fTPReply = this.L.readFTPReply();
                    if (!fTPReply.isSuccessCode()) {
                        throw new FTPException(fTPReply.getCode(), "SECURITY_FTPES cannot be applied: the server refused both AUTH TLS and AUTH SSL commands");
                    }
                    this.L.ssl(this.e);
                }
            }
            boolean z2 = false;
            this.p = false;
            this.L.sendFTPCommand("USER " + str);
            FTPReply fTPReply2 = this.L.readFTPReply();
            int code = fTPReply2.getCode();
            if (code == 230) {
                z = false;
            } else {
                if (code != 331) {
                    throw new FTPException(fTPReply2);
                }
                z = true;
            }
            if (z) {
                if (str2 == null) {
                    throw new FTPException(FTPCodes.USERNAME_OK);
                }
                this.L.sendFTPCommand("PASS " + str2);
                FTPReply fTPReply3 = this.L.readFTPReply();
                int code2 = fTPReply3.getCode();
                if (code2 != 230) {
                    if (code2 != 332) {
                        throw new FTPException(fTPReply3);
                    }
                    z2 = true;
                }
            }
            if (z2) {
                if (str3 == null) {
                    throw new FTPException(FTPCodes.NEED_ACCOUNT);
                }
                this.L.sendFTPCommand("ACCT " + str3);
                FTPReply fTPReply4 = this.L.readFTPReply();
                if (fTPReply4.getCode() != 230) {
                    throw new FTPException(fTPReply4);
                }
            }
            this.p = true;
            this.m = str;
            this.n = str2;
        }
        q();
        s();
    }

    public void upload(File file, FTPDataTransferListener fTPDataTransferListener) throws IllegalStateException, FTPException, FTPDataTransferException, FTPIllegalReplyException, FTPAbortedException, IOException {
        upload(file, 0L, fTPDataTransferListener);
    }

    public String[] connect(String str, int i) throws IllegalStateException, FTPException, FTPIllegalReplyException, IOException {
        String[] messages;
        synchronized (this.J) {
            if (!this.o) {
                Socket socket = null;
                try {
                    try {
                        Socket socketConnectForCommunicationChannel = this.d.connectForCommunicationChannel(str, i);
                        try {
                            if (this.l == 1) {
                                socketConnectForCommunicationChannel = r(socketConnectForCommunicationChannel, str, i);
                            }
                            this.L = new FTPCommunicationChannel(socketConnectForCommunicationChannel, n());
                            Iterator it2 = this.f.iterator();
                            while (it2.hasNext()) {
                                this.L.addCommunicationListener((FTPCommunicationListener) it2.next());
                            }
                            FTPReply fTPReply = this.L.readFTPReply();
                            if (fTPReply.isSuccessCode()) {
                                this.o = true;
                                this.p = false;
                                this.i = null;
                                this.j = str;
                                this.k = i;
                                this.m = null;
                                this.n = null;
                                this.z = false;
                                this.w = false;
                                this.A = false;
                                this.B = false;
                                this.D = false;
                                messages = fTPReply.getMessages();
                                if (!this.o && socketConnectForCommunicationChannel != null) {
                                    try {
                                        socketConnectForCommunicationChannel.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                            } else {
                                throw new FTPException(fTPReply);
                            }
                        } catch (IOException e) {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            socket = socketConnectForCommunicationChannel;
                            if (!this.o && socket != null) {
                                try {
                                    socket.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e2) {
                    throw e2;
                }
            } else {
                throw new IllegalStateException("Client already connected to " + str + " on port " + i);
            }
        }
        return messages;
    }

    public void download(String str, File file, long j) throws IllegalStateException, FTPException, FTPDataTransferException, FTPIllegalReplyException, FTPAbortedException, IOException {
        download(str, file, j, (FTPDataTransferListener) null);
    }

    public void upload(File file, long j) throws IllegalStateException, FTPException, FTPDataTransferException, FTPIllegalReplyException, FTPAbortedException, IOException {
        upload(file, j, null);
    }

    public void download(String str, File file, long j, FTPDataTransferListener fTPDataTransferListener) throws IllegalStateException, FTPException, FTPDataTransferException, FTPIllegalReplyException, FTPAbortedException, IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, j > 0);
            try {
                try {
                    try {
                        try {
                            download(str, fileOutputStream, j, fTPDataTransferListener);
                            try {
                                fileOutputStream.close();
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable unused2) {
                            }
                            throw th;
                        }
                    } catch (FTPDataTransferException e) {
                        throw e;
                    } catch (FTPException e2) {
                        throw e2;
                    }
                } catch (FTPIllegalReplyException e3) {
                    throw e3;
                } catch (IOException e4) {
                    throw e4;
                }
            } catch (FTPAbortedException e5) {
                throw e5;
            } catch (IllegalStateException e6) {
                throw e6;
            }
        } catch (IOException e7) {
            throw new FTPDataTransferException(e7);
        }
    }

    public void upload(File file, long j, FTPDataTransferListener fTPDataTransferListener) throws IllegalStateException, FTPException, FTPDataTransferException, FTPIllegalReplyException, FTPAbortedException, IOException {
        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        try {
                            try {
                                upload(file.getName(), fileInputStream, j, j, fTPDataTransferListener);
                                try {
                                    fileInputStream.close();
                                    return;
                                } catch (Throwable unused) {
                                    return;
                                }
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable unused2) {
                                }
                                throw th;
                            }
                        } catch (FTPDataTransferException e) {
                            throw e;
                        } catch (FTPIllegalReplyException e2) {
                            throw e2;
                        }
                    } catch (FTPException e3) {
                        throw e3;
                    } catch (IOException e4) {
                        throw e4;
                    }
                } catch (FTPAbortedException e5) {
                    throw e5;
                } catch (IllegalStateException e6) {
                    throw e6;
                }
            } catch (IOException e7) {
                throw new FTPDataTransferException(e7);
            }
        }
        throw new FileNotFoundException(file.getAbsolutePath());
    }

    /* JADX WARN: Code duplicated, block: B:145:0x01b0 A[Catch: all -> 0x01ce, TryCatch #9 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:10:0x000f, B:13:0x0017, B:16:0x0028, B:18:0x0037, B:56:0x00e0, B:58:0x00ef, B:61:0x00f6, B:62:0x00fb, B:63:0x00fc, B:65:0x0104, B:68:0x010b, B:69:0x0110, B:70:0x0111, B:72:0x0115, B:74:0x011e, B:75:0x0121, B:129:0x017b, B:131:0x018a, B:134:0x0191, B:135:0x0196, B:136:0x0197, B:138:0x019f, B:141:0x01a6, B:142:0x01ab, B:143:0x01ac, B:145:0x01b0, B:146:0x01b7, B:147:0x01b8, B:148:0x01bd, B:15:0x0021, B:149:0x01be, B:150:0x01c5, B:151:0x01c6, B:152:0x01cd), top: B:170:0x0003 }] */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x016e: MOVE (r12 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r13 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:120:0x016e */
    public void append(String str, InputStream inputStream, long j, FTPDataTransferListener fTPDataTransferListener) throws IllegalStateException, FTPException, FTPDataTransferException, FTPIllegalReplyException, FTPAbortedException, IOException {
        byte b2;
        FTPReply fTPReply;
        FTPReply fTPReply2;
        byte b3;
        synchronized (this.J) {
            if (this.o) {
                if (this.p) {
                    int i = this.r;
                    if (i == 0) {
                        i = i(str);
                    }
                    if (i == 1) {
                        this.L.sendFTPCommand("TYPE A");
                    } else if (i == 2) {
                        this.L.sendFTPCommand("TYPE I");
                    }
                    FTPReply fTPReply3 = this.L.readFTPReply();
                    u();
                    if (fTPReply3.isSuccessCode()) {
                        it.sauronsoftware.ftp4j.a aVarK = k();
                        this.L.sendFTPCommand("APPE " + str);
                        try {
                            try {
                                Socket socketA = aVarK.a();
                                aVarK.dispose();
                                synchronized (this.K) {
                                    this.E = true;
                                    this.H = false;
                                    this.I = false;
                                }
                                try {
                                    try {
                                        inputStream.skip(j);
                                        this.G = socketA.getOutputStream();
                                        if (this.C) {
                                            this.G = new DeflaterOutputStream(this.G);
                                        }
                                        if (fTPDataTransferListener != null) {
                                            fTPDataTransferListener.started();
                                        }
                                        b2 = -1;
                                        if (i != 1) {
                                            if (i == 2) {
                                                byte[] bArr = new byte[this.a];
                                                while (true) {
                                                    int i2 = inputStream.read(bArr);
                                                    if (i2 == -1) {
                                                        break;
                                                    }
                                                    this.G.write(bArr, 0, i2);
                                                    this.G.flush();
                                                    if (fTPDataTransferListener != null) {
                                                        fTPDataTransferListener.transferred(i2);
                                                    }
                                                }
                                            }
                                        } else {
                                            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.G, n());
                                            char[] cArr = new char[this.a];
                                            while (true) {
                                                int i3 = inputStreamReader.read(cArr);
                                                if (i3 == -1) {
                                                    break;
                                                }
                                                outputStreamWriter.write(cArr, 0, i3);
                                                outputStreamWriter.flush();
                                                if (fTPDataTransferListener != null) {
                                                    fTPDataTransferListener.transferred(i3);
                                                }
                                            }
                                        }
                                        OutputStream outputStream = this.G;
                                        if (outputStream != null) {
                                            try {
                                                outputStream.close();
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        try {
                                            socketA.close();
                                        } catch (Throwable unused2) {
                                        }
                                        this.G = null;
                                        try {
                                            synchronized (this.K) {
                                                try {
                                                    boolean z = this.H;
                                                    this.E = false;
                                                    this.H = false;
                                                    FTPReply fTPReply4 = this.L.readFTPReply();
                                                    u();
                                                    if (fTPReply4.getCode() != 150 && fTPReply4.getCode() != 125) {
                                                        throw new FTPException(fTPReply4);
                                                    }
                                                    FTPReply fTPReply5 = this.L.readFTPReply();
                                                    if (!z && fTPReply5.getCode() != 226) {
                                                        throw new FTPException(fTPReply5);
                                                    }
                                                    if (this.I) {
                                                        this.L.readFTPReply();
                                                        this.I = false;
                                                    }
                                                    if (fTPDataTransferListener != null) {
                                                        fTPDataTransferListener.completed();
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    b2 = 0;
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        fTPReply = this.L.readFTPReply();
                                                        u();
                                                        if (fTPReply.getCode() != 150 && fTPReply.getCode() != 125) {
                                                            throw new FTPException(fTPReply);
                                                        }
                                                        fTPReply2 = this.L.readFTPReply();
                                                        if (b2 == 0 && fTPReply2.getCode() != 226) {
                                                            throw new FTPException(fTPReply2);
                                                        }
                                                        if (this.I) {
                                                            this.L.readFTPReply();
                                                            this.I = false;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (IOException e) {
                                        synchronized (this.K) {
                                            if (this.H) {
                                                if (fTPDataTransferListener != null) {
                                                    fTPDataTransferListener.aborted();
                                                }
                                                throw new FTPAbortedException();
                                            }
                                            if (fTPDataTransferListener != null) {
                                                fTPDataTransferListener.failed();
                                            }
                                            throw new FTPDataTransferException("I/O error in data transfer", e);
                                        }
                                    }
                                } catch (Throwable th4) {
                                    OutputStream outputStream2 = this.G;
                                    if (outputStream2 != null) {
                                        try {
                                            outputStream2.close();
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    try {
                                        socketA.close();
                                    } catch (Throwable unused4) {
                                    }
                                    this.G = null;
                                    try {
                                        try {
                                            synchronized (this.K) {
                                                try {
                                                    boolean z2 = this.H;
                                                    this.E = false;
                                                    this.H = false;
                                                    throw th4;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        b2 = b3;
                                        fTPReply = this.L.readFTPReply();
                                        u();
                                        if (fTPReply.getCode() != 150) {
                                            throw new FTPException(fTPReply);
                                        }
                                        fTPReply2 = this.L.readFTPReply();
                                        if (b2 == 0) {
                                            throw new FTPException(fTPReply2);
                                        }
                                        if (this.I) {
                                            this.L.readFTPReply();
                                            this.I = false;
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th8) {
                                aVarK.dispose();
                                throw th8;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            b2 = 0;
                        }
                    } else {
                        throw new FTPException(fTPReply3);
                    }
                } else {
                    throw new IllegalStateException("Client not authenticated");
                }
            } else {
                throw new IllegalStateException("Client not connected");
            }
        }
    }

    public void download(String str, OutputStream outputStream, long j, FTPDataTransferListener fTPDataTransferListener) throws IllegalStateException, FTPException, FTPDataTransferException, FTPIllegalReplyException, FTPAbortedException, IOException {
        synchronized (this.J) {
            if (this.o) {
                if (this.p) {
                    int i = this.r;
                    if (i == 0) {
                        i = i(str);
                    }
                    if (i == 1) {
                        this.L.sendFTPCommand("TYPE A");
                    } else if (i == 2) {
                        this.L.sendFTPCommand("TYPE I");
                    }
                    FTPReply fTPReply = this.L.readFTPReply();
                    u();
                    if (fTPReply.isSuccessCode()) {
                        it.sauronsoftware.ftp4j.a aVarK = k();
                        if (this.w || j > 0) {
                            try {
                                this.L.sendFTPCommand("REST " + j);
                                FTPReply fTPReply2 = this.L.readFTPReply();
                                u();
                                if (fTPReply2.getCode() != 350 && ((fTPReply2.getCode() != 501 && fTPReply2.getCode() != 502) || j > 0)) {
                                    throw new FTPException(fTPReply2);
                                }
                            } catch (Throwable th) {
                                aVarK.dispose();
                                throw th;
                            }
                        }
                        this.L.sendFTPCommand("RETR " + str);
                        try {
                            try {
                                Socket socketA = aVarK.a();
                                int i2 = this.b;
                                if (i2 > 0) {
                                    socketA.setSendBufferSize(i2);
                                }
                                int i3 = this.c;
                                if (i3 > 0) {
                                    socketA.setReceiveBufferSize(i3);
                                }
                                aVarK.dispose();
                                synchronized (this.K) {
                                    this.E = true;
                                    this.H = false;
                                    this.I = false;
                                }
                                try {
                                    try {
                                        try {
                                            this.F = socketA.getInputStream();
                                            if (this.C) {
                                                this.F = new InflaterInputStream(this.F);
                                            }
                                            if (fTPDataTransferListener != null) {
                                                fTPDataTransferListener.started();
                                            }
                                            if (i != 1) {
                                                if (i == 2) {
                                                    int i4 = this.a;
                                                    byte[] bArr = new byte[i4];
                                                    while (true) {
                                                        int i5 = this.F.read(bArr, 0, i4);
                                                        if (i5 == -1) {
                                                            break;
                                                        }
                                                        outputStream.write(bArr, 0, i5);
                                                        if (fTPDataTransferListener != null) {
                                                            fTPDataTransferListener.transferred(i5);
                                                        }
                                                    }
                                                }
                                            } else {
                                                InputStreamReader inputStreamReader = new InputStreamReader(this.F, n());
                                                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
                                                int i6 = this.a;
                                                char[] cArr = new char[i6];
                                                while (true) {
                                                    int i7 = inputStreamReader.read(cArr, 0, i6);
                                                    if (i7 == -1) {
                                                        break;
                                                    }
                                                    outputStreamWriter.write(cArr, 0, i7);
                                                    outputStreamWriter.flush();
                                                    if (fTPDataTransferListener != null) {
                                                        fTPDataTransferListener.transferred(i7);
                                                    }
                                                }
                                            }
                                            InputStream inputStream = this.F;
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            try {
                                                socketA.close();
                                            } catch (Throwable unused2) {
                                            }
                                            this.F = null;
                                            try {
                                                synchronized (this.K) {
                                                    try {
                                                        boolean z = this.H;
                                                        this.E = false;
                                                        this.H = false;
                                                        FTPReply fTPReply3 = this.L.readFTPReply();
                                                        u();
                                                        if (fTPReply3.getCode() != 150 && fTPReply3.getCode() != 125) {
                                                            throw new FTPException(fTPReply3);
                                                        }
                                                        FTPReply fTPReply4 = this.L.readFTPReply();
                                                        if (!z && fTPReply4.getCode() != 226) {
                                                            throw new FTPException(fTPReply4);
                                                        }
                                                        if (this.I) {
                                                            this.L.readFTPReply();
                                                            this.I = false;
                                                        }
                                                        if (fTPDataTransferListener != null) {
                                                            fTPDataTransferListener.completed();
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        } catch (IOException e) {
                                            synchronized (this.K) {
                                                if (this.H) {
                                                    if (fTPDataTransferListener != null) {
                                                        fTPDataTransferListener.aborted();
                                                    }
                                                    throw new FTPAbortedException();
                                                }
                                                if (fTPDataTransferListener != null) {
                                                    fTPDataTransferListener.failed();
                                                }
                                                throw new FTPDataTransferException("I/O error in data transfer", e);
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        InputStream inputStream2 = this.F;
                                        if (inputStream2 != null) {
                                            try {
                                                inputStream2.close();
                                            } catch (Throwable unused3) {
                                            }
                                        }
                                        try {
                                            socketA.close();
                                        } catch (Throwable unused4) {
                                        }
                                        this.F = null;
                                        try {
                                            synchronized (this.K) {
                                                try {
                                                    boolean z2 = this.H;
                                                    this.E = false;
                                                    this.H = false;
                                                    throw th4;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    FTPReply fTPReply5 = this.L.readFTPReply();
                                    u();
                                    if (fTPReply5.getCode() != 150 && fTPReply5.getCode() != 125) {
                                        throw new FTPException(fTPReply5);
                                    }
                                    FTPReply fTPReply6 = this.L.readFTPReply();
                                    if (i == 0 && fTPReply6.getCode() != 226) {
                                        throw new FTPException(fTPReply6);
                                    }
                                    if (this.I) {
                                        this.L.readFTPReply();
                                        this.I = false;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                aVarK.dispose();
                                throw th8;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            i = 0;
                        }
                    } else {
                        throw new FTPException(fTPReply);
                    }
                } else {
                    throw new IllegalStateException("Client not authenticated");
                }
            } else {
                throw new IllegalStateException("Client not connected");
            }
        }
    }

    public void upload(String str, InputStream inputStream, long j, long j2, FTPDataTransferListener fTPDataTransferListener) throws IllegalStateException, FTPException, FTPDataTransferException, FTPIllegalReplyException, FTPAbortedException, IOException {
        synchronized (this.J) {
            if (this.o) {
                if (this.p) {
                    int i = this.r;
                    if (i == 0) {
                        i = i(str);
                    }
                    char c2 = 2;
                    if (i == 1) {
                        this.L.sendFTPCommand("TYPE A");
                    } else if (i == 2) {
                        this.L.sendFTPCommand("TYPE I");
                    }
                    FTPReply fTPReply = this.L.readFTPReply();
                    u();
                    if (fTPReply.isSuccessCode()) {
                        it.sauronsoftware.ftp4j.a aVarK = k();
                        if (this.w || j > 0) {
                            try {
                                this.L.sendFTPCommand("REST " + j);
                                FTPReply fTPReply2 = this.L.readFTPReply();
                                u();
                                if (fTPReply2.getCode() != 350 && ((fTPReply2.getCode() != 501 && fTPReply2.getCode() != 502) || j > 0)) {
                                    throw new FTPException(fTPReply2);
                                }
                            } catch (Throwable th) {
                                aVarK.dispose();
                                throw th;
                            }
                        }
                        this.L.sendFTPCommand("STOR " + str);
                        try {
                            try {
                                Socket socketA = aVarK.a();
                                int i2 = this.b;
                                if (i2 > 0) {
                                    socketA.setSendBufferSize(i2);
                                }
                                int i3 = this.c;
                                if (i3 > 0) {
                                    socketA.setReceiveBufferSize(i3);
                                }
                                aVarK.dispose();
                                synchronized (this.K) {
                                    this.E = true;
                                    this.H = false;
                                    this.I = false;
                                }
                                try {
                                    try {
                                        try {
                                            inputStream.skip(j2);
                                            this.G = socketA.getOutputStream();
                                            if (this.C) {
                                                this.G = new DeflaterOutputStream(this.G);
                                            }
                                            if (fTPDataTransferListener != null) {
                                                fTPDataTransferListener.started();
                                            }
                                            if (i != 1) {
                                                if (i == 2) {
                                                    byte[] bArr = new byte[this.a];
                                                    while (true) {
                                                        int i4 = inputStream.read(bArr);
                                                        if (i4 == -1) {
                                                            break;
                                                        }
                                                        this.G.write(bArr, 0, i4);
                                                        this.G.flush();
                                                        if (fTPDataTransferListener != null) {
                                                            fTPDataTransferListener.transferred(i4);
                                                        }
                                                    }
                                                }
                                            } else {
                                                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                                                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.G, n());
                                                char[] cArr = new char[this.a];
                                                while (true) {
                                                    int i5 = inputStreamReader.read(cArr);
                                                    if (i5 == -1) {
                                                        break;
                                                    }
                                                    outputStreamWriter.write(cArr, 0, i5);
                                                    outputStreamWriter.flush();
                                                    if (fTPDataTransferListener != null) {
                                                        fTPDataTransferListener.transferred(i5);
                                                    }
                                                }
                                            }
                                            OutputStream outputStream = this.G;
                                            if (outputStream != null) {
                                                try {
                                                    outputStream.close();
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            try {
                                                socketA.close();
                                            } catch (Throwable unused2) {
                                            }
                                            this.G = null;
                                            try {
                                                synchronized (this.K) {
                                                    try {
                                                        boolean z = this.H;
                                                        this.E = false;
                                                        this.H = false;
                                                        FTPReply fTPReply3 = this.L.readFTPReply();
                                                        u();
                                                        if (fTPReply3.getCode() != 150 && fTPReply3.getCode() != 125) {
                                                            throw new FTPException(fTPReply3);
                                                        }
                                                        FTPReply fTPReply4 = this.L.readFTPReply();
                                                        if (!z && fTPReply4.getCode() != 226) {
                                                            throw new FTPException(fTPReply4);
                                                        }
                                                        if (this.I) {
                                                            this.L.readFTPReply();
                                                            this.I = false;
                                                        }
                                                        if (fTPDataTransferListener != null) {
                                                            fTPDataTransferListener.completed();
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        } catch (IOException e) {
                                            synchronized (this.K) {
                                                if (this.H) {
                                                    if (fTPDataTransferListener != null) {
                                                        fTPDataTransferListener.aborted();
                                                    }
                                                    throw new FTPAbortedException();
                                                }
                                                if (fTPDataTransferListener != null) {
                                                    fTPDataTransferListener.failed();
                                                }
                                                throw new FTPDataTransferException("I/O error in data transfer", e);
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        FTPReply fTPReply5 = this.L.readFTPReply();
                                        u();
                                        if (fTPReply5.getCode() != 150 && fTPReply5.getCode() != 125) {
                                            throw new FTPException(fTPReply5);
                                        }
                                        FTPReply fTPReply6 = this.L.readFTPReply();
                                        if (c2 == 0 && fTPReply6.getCode() != 226) {
                                            throw new FTPException(fTPReply6);
                                        }
                                        if (this.I) {
                                            this.L.readFTPReply();
                                            this.I = false;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    OutputStream outputStream2 = this.G;
                                    if (outputStream2 != null) {
                                        try {
                                            outputStream2.close();
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    try {
                                        socketA.close();
                                    } catch (Throwable unused4) {
                                    }
                                    this.G = null;
                                    try {
                                        synchronized (this.K) {
                                            try {
                                                boolean z2 = this.H;
                                                this.E = false;
                                                this.H = false;
                                                throw th5;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                    }
                                }
                            } catch (Throwable th8) {
                                aVarK.dispose();
                                throw th8;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            c2 = 0;
                        }
                    } else {
                        throw new FTPException(fTPReply);
                    }
                } else {
                    throw new IllegalStateException("Client not authenticated");
                }
            } else {
                throw new IllegalStateException("Client not connected");
            }
        }
    }

    public FTPFile[] list() throws IllegalStateException, FTPException, FTPDataTransferException, FTPIllegalReplyException, FTPAbortedException, FTPListParseException, IOException {
        return list(null);
    }
}
