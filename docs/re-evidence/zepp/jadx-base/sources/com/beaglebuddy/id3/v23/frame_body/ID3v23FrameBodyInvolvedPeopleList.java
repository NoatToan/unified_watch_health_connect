package com.beaglebuddy.id3.v23.frame_body;

import com.beaglebuddy.id3.enums.v23.Encoding;
import com.beaglebuddy.id3.enums.v23.FrameType;
import com.beaglebuddy.util.Utility;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class ID3v23FrameBodyInvolvedPeopleList extends ID3v23FrameBody {
    private Encoding a;
    private List<InvolvedPerson> b;

    public static class InvolvedPerson {
        private String a;
        private String b;

        public InvolvedPerson(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public String getInvolvement() {
            return this.b;
        }

        public String getPerson() {
            return this.a;
        }

        public void setInvolvement(String str) {
            this.b = str;
        }

        public void setPerson(String str) {
            this.a = str;
        }
    }

    public ID3v23FrameBodyInvolvedPeopleList() {
        this(Encoding.ISO_8859_1, new Vector());
    }

    public Encoding getEncoding() {
        return this.a;
    }

    public List<InvolvedPerson> getInvolvedPeople() {
        return this.b;
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void parse() throws IllegalArgumentException {
        try {
            setEncoding(Encoding.valueOf(this.buffer[0]));
            while (true) {
                int i = this.nullTerminatorIndex;
                if (i >= this.buffer.length) {
                    this.dirty = false;
                    return;
                }
                int nextNullTerminator = getNextNullTerminator(i, this.a);
                this.nextNullTerminatorIndex = nextNullTerminator;
                String strTrim = new String(this.buffer, this.nullTerminatorIndex, nextNullTerminator, this.a.getCharacterSet()).trim();
                int numBytesInNullTerminator = this.nextNullTerminatorIndex + this.a.getNumBytesInNullTerminator();
                this.nullTerminatorIndex = numBytesInNullTerminator;
                int nextNullTerminator2 = getNextNullTerminator(numBytesInNullTerminator, this.a);
                this.nextNullTerminatorIndex = nextNullTerminator2;
                String strTrim2 = new String(this.buffer, this.nullTerminatorIndex, nextNullTerminator2, this.a.getCharacterSet()).trim();
                this.nullTerminatorIndex = this.nextNullTerminatorIndex + this.a.getNumBytesInNullTerminator();
                this.b.add(new InvolvedPerson(strTrim2, strTrim));
            }
        } catch (IllegalArgumentException unused) {
            setEncoding(Encoding.ISO_8859_1);
        }
        this.nullTerminatorIndex = 1;
        this.b = new Vector();
    }

    @Override // com.beaglebuddy.id3.v23.frame_body.ID3v23FrameBody
    public void setBuffer() {
        if (isDirty()) {
            int length = 0;
            for (InvolvedPerson involvedPerson : this.b) {
                length = length + ID3v23FrameBodyUtility.stringToBytes(this.a, involvedPerson.getInvolvement()).length + ID3v23FrameBodyUtility.stringToBytes(this.a, involvedPerson.getPerson()).length;
            }
            int length2 = 1;
            byte[] bArr = new byte[length + 1];
            this.buffer = bArr;
            bArr[0] = (byte) this.a.ordinal();
            for (InvolvedPerson involvedPerson2 : this.b) {
                byte[] bArrStringToBytes = ID3v23FrameBodyUtility.stringToBytes(this.a, involvedPerson2.getInvolvement());
                byte[] bArrStringToBytes2 = ID3v23FrameBodyUtility.stringToBytes(this.a, involvedPerson2.getPerson());
                System.arraycopy(bArrStringToBytes, 0, this.buffer, length2, bArrStringToBytes.length);
                int length3 = length2 + bArrStringToBytes.length;
                System.arraycopy(bArrStringToBytes2, 0, this.buffer, length3, bArrStringToBytes2.length);
                length2 = length3 + bArrStringToBytes2.length;
            }
            this.dirty = false;
        }
    }

    public void setEncoding(Encoding encoding) {
        if (encoding != null) {
            this.a = encoding;
            this.dirty = true;
        } else {
            throw new IllegalArgumentException("The encoding field in the " + this.frameType.getId() + " frame may not be null.");
        }
    }

    public void setInvolvedPeople(List<InvolvedPerson> list) {
        if (list == null) {
            list = new Vector<>();
        }
        this.b = list;
        this.dirty = true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("frame body: involved people\n");
        stringBuffer.append("   bytes...: " + this.buffer.length + " bytes\n");
        stringBuffer.append("             " + Utility.hex(this.buffer, 13) + "\n");
        stringBuffer.append("   encoding: " + this.a + "\n");
        stringBuffer.append("   people..: " + this.b.size() + "\n");
        for (InvolvedPerson involvedPerson : this.b) {
            stringBuffer.append("             " + involvedPerson.getPerson() + ", " + involvedPerson.getInvolvement() + "\n");
        }
        return stringBuffer.toString();
    }

    public ID3v23FrameBodyInvolvedPeopleList(Encoding encoding, List<InvolvedPerson> list) {
        super(FrameType.INVOLVED_PEOPLE_LIST);
        setEncoding(encoding);
        setInvolvedPeople(list);
        this.dirty = true;
    }

    public ID3v23FrameBodyInvolvedPeopleList(InputStream inputStream, int i) throws IOException {
        super(inputStream, FrameType.INVOLVED_PEOPLE_LIST, i);
    }
}
