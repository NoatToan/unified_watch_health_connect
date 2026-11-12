package com.google.i18n.phonenumbers.metadata.init;

import com.google.i18n.phonenumbers.Phonemetadata;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class MetadataParser {
    private static final Logger logger = Logger.getLogger(MetadataParser.class.getName());
    private final boolean strictMode;

    private MetadataParser(boolean z14) {
        this.strictMode = z14;
    }

    private void close(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e4) {
            logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e4);
        }
    }

    private List<Phonemetadata.PhoneMetadata> handleNullSource() {
        if (!this.strictMode) {
            return Collections.EMPTY_LIST;
        }
        h.s("Source cannot be null");
        return null;
    }

    public static MetadataParser newLenientParser() {
        return new MetadataParser(false);
    }

    public static MetadataParser newStrictParser() {
        return new MetadataParser(true);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    public Collection<Phonemetadata.PhoneMetadata> parse(InputStream inputStream) throws Throwable {
        Throwable th3;
        IOException e4;
        if (inputStream == null) {
            return handleNullSource();
        }
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                try {
                    Phonemetadata.PhoneMetadataCollection phoneMetadataCollection = new Phonemetadata.PhoneMetadataCollection();
                    phoneMetadataCollection.readExternal(objectInputStream);
                    if (phoneMetadataCollection.getMetadataList().isEmpty()) {
                        throw new IllegalStateException("Empty metadata");
                    }
                    List<Phonemetadata.PhoneMetadata> metadataList = phoneMetadataCollection.getMetadataList();
                    close(objectInputStream);
                    return metadataList;
                } catch (IOException e14) {
                    e4 = e14;
                    throw new IllegalStateException("Unable to parse metadata file", e4);
                }
            } catch (Throwable th4) {
                th3 = th4;
                if (0 != 0) {
                    close(null);
                } else {
                    close(inputStream);
                }
                throw th3;
            }
        } catch (IOException e15) {
            e4 = e15;
        } catch (Throwable th5) {
            th3 = th5;
            if (0 != 0) {
                close(null);
            } else {
                close(inputStream);
            }
            throw th3;
        }
    }
}
