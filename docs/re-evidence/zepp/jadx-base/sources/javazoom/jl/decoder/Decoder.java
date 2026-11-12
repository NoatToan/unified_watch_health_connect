package javazoom.jl.decoder;

import java.util.Objects;
import org.cybergarage.upnp.Argument;

/* JADX INFO: loaded from: classes23.dex */
public class Decoder implements DecoderErrors {
    private static final Params l = new Params();
    private Obuffer a;
    private e b;
    private e c;
    private d d;
    private c e;
    private b f;
    private int g;
    private int h;
    private Equalizer i;
    private Params j;
    private boolean k;

    public static class Params implements Cloneable {
        private OutputChannels a = OutputChannels.BOTH;
        private Equalizer b = new Equalizer();

        public Object clone() {
            try {
                return super.clone();
            } catch (CloneNotSupportedException e) {
                throw new InternalError(this + ": " + e);
            }
        }

        public Equalizer getInitialEqualizerSettings() {
            return this.b;
        }

        public OutputChannels getOutputChannels() {
            return this.a;
        }

        public void setOutputChannels(OutputChannels outputChannels) {
            Objects.requireNonNull(outputChannels, Argument.OUT);
            this.a = outputChannels;
        }
    }

    public Decoder() {
        this(null);
    }

    private void a(Header header) throws DecoderException {
        int iMode = header.mode();
        header.layer();
        int i = iMode == 3 ? 1 : 2;
        if (this.a == null) {
            this.a = new SampleBuffer(header.frequency(), i);
        }
        float[] fArrB = this.i.b();
        this.b = new e(0, 32700.0f, fArrB);
        if (i == 2) {
            this.c = new e(1, 32700.0f, fArrB);
        }
        this.h = i;
        this.g = header.frequency();
        this.k = true;
    }

    public static Params getDefaultParams() {
        return (Params) l.clone();
    }

    public Obuffer decodeFrame(Header header, Bitstream bitstream) throws DecoderException {
        if (!this.k) {
            a(header);
        }
        int iLayer = header.layer();
        this.a.clear_buffer();
        retrieveDecoder(header, bitstream, iLayer).decodeFrame();
        this.a.write_buffer(1);
        return this.a;
    }

    public int getOutputBlockSize() {
        return 2304;
    }

    public int getOutputChannels() {
        return this.h;
    }

    public int getOutputFrequency() {
        return this.g;
    }

    public DecoderException newDecoderException(int i) {
        return new DecoderException(i, (Throwable) null);
    }

    public FrameDecoder retrieveDecoder(Header header, Bitstream bitstream, int i) throws DecoderException {
        FrameDecoder frameDecoder;
        if (i == 1) {
            if (this.f == null) {
                b bVar = new b();
                this.f = bVar;
                bVar.a(bitstream, header, this.b, this.c, this.a, 0);
            }
            frameDecoder = this.f;
        } else if (i == 2) {
            if (this.e == null) {
                c cVar = new c();
                this.e = cVar;
                cVar.a(bitstream, header, this.b, this.c, this.a, 0);
            }
            frameDecoder = this.e;
        } else if (i != 3) {
            frameDecoder = null;
        } else {
            if (this.d == null) {
                this.d = new d(bitstream, header, this.b, this.c, this.a, 0);
            }
            frameDecoder = this.d;
        }
        if (frameDecoder != null) {
            return frameDecoder;
        }
        throw newDecoderException(513, null);
    }

    public void setEqualizer(Equalizer equalizer) {
        if (equalizer == null) {
            equalizer = Equalizer.PASS_THRU_EQ;
        }
        this.i.setFrom(equalizer);
        float[] fArrB = this.i.b();
        e eVar = this.b;
        if (eVar != null) {
            eVar.y(fArrB);
        }
        e eVar2 = this.c;
        if (eVar2 != null) {
            eVar2.y(fArrB);
        }
    }

    public void setOutputBuffer(Obuffer obuffer) {
        this.a = obuffer;
    }

    public Decoder(Params params) {
        this.i = new Equalizer();
        params = params == null ? l : params;
        this.j = params;
        Equalizer initialEqualizerSettings = params.getInitialEqualizerSettings();
        if (initialEqualizerSettings != null) {
            this.i.setFrom(initialEqualizerSettings);
        }
    }

    public DecoderException newDecoderException(int i, Throwable th) {
        return new DecoderException(i, th);
    }
}
