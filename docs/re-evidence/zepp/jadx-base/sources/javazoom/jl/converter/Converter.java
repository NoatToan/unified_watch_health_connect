package javazoom.jl.converter;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.Header;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.decoder.Obuffer;

/* JADX INFO: loaded from: classes22.dex */
public class Converter {

    public static class PrintWriterProgressListener implements ProgressListener {
        public static final int DEBUG_DETAIL = 7;
        public static final int EXPERT_DETAIL = 1;
        public static final int MAX_DETAIL = 10;
        public static final int NO_DETAIL = 0;
        public static final int VERBOSE_DETAIL = 2;
        private PrintWriter a;
        private int b;

        public PrintWriterProgressListener(PrintWriter printWriter, int i) {
            this.a = printWriter;
            this.b = i;
        }

        public static PrintWriterProgressListener newStdOut(int i) {
            return new PrintWriterProgressListener(new PrintWriter((OutputStream) System.out, true), i);
        }

        @Override // javazoom.jl.converter.Converter.ProgressListener
        public boolean converterException(Throwable th) {
            if (this.b <= 0) {
                return false;
            }
            th.printStackTrace(this.a);
            this.a.flush();
            return false;
        }

        @Override // javazoom.jl.converter.Converter.ProgressListener
        public void converterUpdate(int i, int i2, int i3) {
            if (isDetail(2) && i == 2) {
                if (i3 == 0) {
                    i3 = 1;
                }
                this.a.println();
                this.a.println("Converted " + i3 + " frames in " + i2 + " ms (" + (i2 / i3) + " ms per frame.)");
            }
        }

        @Override // javazoom.jl.converter.Converter.ProgressListener
        public void decodedFrame(int i, Header header, Obuffer obuffer) {
            if (!isDetail(10)) {
                if (isDetail(2)) {
                    if (i == 0) {
                        this.a.print("Converting.");
                        this.a.flush();
                    }
                    if (i % 10 == 0) {
                        this.a.print('.');
                        this.a.flush();
                        return;
                    }
                    return;
                }
                return;
            }
            String string = header.toString();
            this.a.println("Decoded frame " + i + ": " + string);
            PrintWriter printWriter = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("Output: ");
            sb.append(obuffer);
            printWriter.println(sb.toString());
        }

        public boolean isDetail(int i) {
            return this.b >= i;
        }

        @Override // javazoom.jl.converter.Converter.ProgressListener
        public void parsedFrame(int i, Header header) {
            if (i == 0 && isDetail(2)) {
                String string = header.toString();
                this.a.println("File is a " + string);
                return;
            }
            if (isDetail(10)) {
                String string2 = header.toString();
                this.a.println("Prased frame " + i + ": " + string2);
            }
        }

        @Override // javazoom.jl.converter.Converter.ProgressListener
        public void readFrame(int i, Header header) {
            if (i == 0 && isDetail(2)) {
                String string = header.toString();
                this.a.println("File is a " + string);
                return;
            }
            if (isDetail(10)) {
                String string2 = header.toString();
                this.a.println("Read frame " + i + ": " + string2);
            }
        }
    }

    public interface ProgressListener {
        public static final int UPDATE_CONVERT_COMPLETE = 2;
        public static final int UPDATE_FRAME_COUNT = 1;

        boolean converterException(Throwable th);

        void converterUpdate(int i, int i2, int i3);

        void decodedFrame(int i, Header header, Obuffer obuffer);

        void parsedFrame(int i, Header header);

        void readFrame(int i, Header header);
    }

    public synchronized void convert(String str, String str2) throws JavaLayerException {
        convert(str, str2, (ProgressListener) null, (Decoder.Params) null);
    }

    public int countFrames(InputStream inputStream) {
        return -1;
    }

    public InputStream openInput(String str) throws IOException {
        return new BufferedInputStream(new FileInputStream(new File(str)));
    }

    public synchronized void convert(String str, String str2, ProgressListener progressListener) throws JavaLayerException {
        convert(str, str2, progressListener, (Decoder.Params) null);
    }

    public void convert(String str, String str2, ProgressListener progressListener, Decoder.Params params) throws JavaLayerException {
        if (str2.length() == 0) {
            str2 = null;
        }
        try {
            InputStream inputStreamOpenInput = openInput(str);
            convert(inputStreamOpenInput, str2, progressListener, params);
            inputStreamOpenInput.close();
        } catch (IOException e) {
            throw new JavaLayerException(e.getLocalizedMessage(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019 A[Catch: all -> 0x00aa, IOException -> 0x00ac, TryCatch #5 {IOException -> 0x00ac, blocks: (B:6:0x0008, B:8:0x000c, B:9:0x0012, B:11:0x0019, B:13:0x0025, B:16:0x0039, B:48:0x0096, B:49:0x0099, B:51:0x009c, B:52:0x009f), top: B:66:0x0008, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047 A[Catch: all -> 0x007d, Exception -> 0x007f, TryCatch #0 {Exception -> 0x007f, blocks: (B:19:0x0040, B:22:0x0047, B:24:0x004c, B:27:0x0054, B:34:0x0068, B:36:0x006e, B:37:0x0075, B:38:0x007c), top: B:62:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[Catch: all -> 0x007d, Exception -> 0x007f, TryCatch #0 {Exception -> 0x007f, blocks: (B:19:0x0040, B:22:0x0047, B:24:0x004c, B:27:0x0054, B:34:0x0068, B:36:0x006e, B:37:0x0075, B:38:0x007c), top: B:62:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e A[Catch: all -> 0x007d, Exception -> 0x007f, TryCatch #0 {Exception -> 0x007f, blocks: (B:19:0x0040, B:22:0x0047, B:24:0x004c, B:27:0x0054, B:34:0x0068, B:36:0x006e, B:37:0x0075, B:38:0x007c), top: B:62:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0075 A[Catch: all -> 0x007d, Exception -> 0x007f, TryCatch #0 {Exception -> 0x007f, blocks: (B:19:0x0040, B:22:0x0047, B:24:0x004c, B:27:0x0054, B:34:0x0068, B:36:0x006e, B:37:0x0075, B:38:0x007c), top: B:62:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0096 A[Catch: all -> 0x00aa, IOException -> 0x00ac, TRY_ENTER, TryCatch #5 {IOException -> 0x00ac, blocks: (B:6:0x0008, B:8:0x000c, B:9:0x0012, B:11:0x0019, B:13:0x0025, B:16:0x0039, B:48:0x0096, B:49:0x0099, B:51:0x009c, B:52:0x009f), top: B:66:0x0008, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x009c A[Catch: all -> 0x00aa, IOException -> 0x00ac, TryCatch #5 {IOException -> 0x00ac, blocks: (B:6:0x0008, B:8:0x000c, B:9:0x0012, B:11:0x0019, B:13:0x0025, B:16:0x0039, B:48:0x0096, B:49:0x0099, B:51:0x009c, B:52:0x009f), top: B:66:0x0008, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x009a A[EDGE_INSN: B:69:0x009a->B:50:0x009a BREAK  A[LOOP:0: B:17:0x003d->B:44:0x0087], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x000c A[Catch: all -> 0x00aa, IOException -> 0x00ac, TryCatch #5 {IOException -> 0x00ac, blocks: (B:6:0x0008, B:8:0x000c, B:9:0x0012, B:11:0x0019, B:13:0x0025, B:16:0x0039, B:48:0x0096, B:49:0x0099, B:51:0x009c, B:52:0x009f), top: B:66:0x0008, outer: #2 }] */
    public synchronized void convert(InputStream inputStream, String str, ProgressListener progressListener, Decoder.Params params) throws JavaLayerException {
        int iCountFrames;
        WaveFileObuffer waveFileObuffer;
        Decoder decoder;
        Bitstream bitstream;
        Header frame;
        WaveFileObuffer waveFileObuffer2;
        int i = 0;
        if (progressListener == null) {
            progressListener = PrintWriterProgressListener.newStdOut(0);
            try {
                if (!(inputStream instanceof BufferedInputStream)) {
                    inputStream = new BufferedInputStream(inputStream);
                }
                if (inputStream.markSupported()) {
                    inputStream.mark(-1);
                    iCountFrames = countFrames(inputStream);
                    inputStream.reset();
                } else {
                    iCountFrames = -1;
                }
                progressListener.converterUpdate(1, iCountFrames, 0);
                waveFileObuffer = null;
                decoder = new Decoder(params);
                bitstream = new Bitstream(inputStream);
                if (iCountFrames == -1) {
                    iCountFrames = Integer.MAX_VALUE;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                while (true) {
                    if (i < iCountFrames) {
                        break;
                    }
                    try {
                        try {
                            frame = bitstream.readFrame();
                            if (frame == null) {
                                break;
                            }
                            progressListener.readFrame(i, frame);
                            if (waveFileObuffer == null) {
                                waveFileObuffer2 = new WaveFileObuffer(frame.mode() == 3 ? 1 : 2, frame.frequency(), str);
                                try {
                                    decoder.setOutputBuffer(waveFileObuffer2);
                                    waveFileObuffer = waveFileObuffer2;
                                } catch (Exception e) {
                                    e = e;
                                    waveFileObuffer = waveFileObuffer2;
                                    if (!progressListener.converterException(e)) {
                                        throw new JavaLayerException(e.getLocalizedMessage(), e);
                                    }
                                    if (waveFileObuffer != null) {
                                        waveFileObuffer.close();
                                    }
                                    throw th;
                                } catch (Throwable th) {
                                    th = th;
                                    waveFileObuffer = waveFileObuffer2;
                                }
                            }
                            if (decoder.decodeFrame(frame, bitstream) == waveFileObuffer) {
                                progressListener.decodedFrame(i, frame, waveFileObuffer);
                                bitstream.closeFrame();
                                i++;
                            } else {
                                throw new InternalError("Output buffers are different.");
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        if (!progressListener.converterException(e)) {
                            throw new JavaLayerException(e.getLocalizedMessage(), e);
                        }
                        i++;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (waveFileObuffer != null) {
                        waveFileObuffer.close();
                    }
                    throw th;
                }
                if (waveFileObuffer != null) {
                    waveFileObuffer.close();
                }
                progressListener.converterUpdate(2, (int) (System.currentTimeMillis() - jCurrentTimeMillis), i);
            } catch (IOException e3) {
                throw new JavaLayerException(e3.getLocalizedMessage(), e3);
            }
        } else {
            if (!(inputStream instanceof BufferedInputStream)) {
                inputStream = new BufferedInputStream(inputStream);
            }
            if (inputStream.markSupported()) {
                inputStream.mark(-1);
                iCountFrames = countFrames(inputStream);
                inputStream.reset();
            } else {
                iCountFrames = -1;
            }
            progressListener.converterUpdate(1, iCountFrames, 0);
            waveFileObuffer = null;
            decoder = new Decoder(params);
            bitstream = new Bitstream(inputStream);
            if (iCountFrames == -1) {
                iCountFrames = Integer.MAX_VALUE;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            while (true) {
                if (i < iCountFrames) {
                    break;
                    break;
                }
                frame = bitstream.readFrame();
                if (frame == null) {
                    break;
                    break;
                }
                progressListener.readFrame(i, frame);
                if (waveFileObuffer == null) {
                    waveFileObuffer2 = new WaveFileObuffer(frame.mode() == 3 ? 1 : 2, frame.frequency(), str);
                    decoder.setOutputBuffer(waveFileObuffer2);
                    waveFileObuffer = waveFileObuffer2;
                }
                if (decoder.decodeFrame(frame, bitstream) == waveFileObuffer) {
                    progressListener.decodedFrame(i, frame, waveFileObuffer);
                    bitstream.closeFrame();
                    i++;
                } else {
                    throw new InternalError("Output buffers are different.");
                }
                if (!progressListener.converterException(e)) {
                    throw new JavaLayerException(e.getLocalizedMessage(), e);
                }
                i++;
                if (waveFileObuffer != null) {
                    waveFileObuffer.close();
                }
                throw th;
            }
            if (waveFileObuffer != null) {
                waveFileObuffer.close();
            }
            progressListener.converterUpdate(2, (int) (System.currentTimeMillis() - jCurrentTimeMillis2), i);
        }
        throw th;
    }
}
