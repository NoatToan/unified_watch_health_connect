package com.beaglebuddy.mp3;

import com.beaglebuddy.id3.enums.Genre;
import com.beaglebuddy.id3.enums.ID3TagVersion;
import com.beaglebuddy.id3.enums.Language;
import com.beaglebuddy.id3.enums.PictureType;
import com.beaglebuddy.id3.pojo.AttachedPicture;
import com.beaglebuddy.id3.pojo.SynchronizedLyric;
import com.beaglebuddy.id3.v23.ID3v23Tag;
import com.beaglebuddy.mpeg.enums.BitrateType;
import com.beaglebuddy.mpeg.enums.ChannelMode;
import com.beaglebuddy.mpeg.enums.Layer;
import com.beaglebuddy.mpeg.enums.MPEGVersion;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class MP3 extends MP3Base {
    public MP3(String str) throws IOException {
        this(new File(str));
    }

    public void clear() throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        ID3v23Tag iD3v23Tag = this.id3v23Tag;
        if (iD3v23Tag != null) {
            iD3v23Tag.removeFrames();
        } else {
            this.id3v24Tag.removeFrames();
        }
    }

    public String getAlbum() {
        return this.id3v23Tag != null ? getV23Album() : getV24Album();
    }

    public int getAudioDuration() {
        return this.id3v23Tag != null ? getV23AudioDuration() : getV24AudioDuration();
    }

    public int getAudioSize() {
        return this.id3v23Tag != null ? getV23AudioSize() : this.audioSize;
    }

    public String getBand() {
        return this.id3v23Tag != null ? getV23Band() : getV24Band();
    }

    public int getBitrate() {
        if (this.bitrate == -1 && this.bitrateType == BitrateType.VBR) {
            try {
                validateMPEGFrames();
            } catch (IOException unused) {
            }
        }
        return this.bitrate;
    }

    public BitrateType getBitrateType() {
        return this.bitrateType;
    }

    public ChannelMode getChannelMode() {
        return this.mpegFrame.getMPEGFrameHeader().getChannelMode();
    }

    public String getCodec() {
        return this.mpegFrame.getMPEGFrameHeader().getMPEGVersion() + " " + this.mpegFrame.getMPEGFrameHeader().getLayer();
    }

    public String getComments() {
        return this.id3v23Tag != null ? getV23Comments(Language.ENG) : getV24Comments(Language.ENG);
    }

    public int getDisc() {
        return this.id3v23Tag != null ? getV23Disc() : getV24Disc();
    }

    public int getFrequency() {
        return this.mpegFrame.getMPEGFrameHeader().getFrequency();
    }

    public Layer getLayer() {
        return this.mpegFrame.getMPEGFrameHeader().getLayer();
    }

    public String getLeadPerformer() {
        return this.id3v23Tag != null ? getV23LeadPerformer() : getV24LeadPerformer();
    }

    public String getLyrics() {
        return getLyrics(Language.ENG);
    }

    public String getLyricsBy() {
        return this.id3v23Tag != null ? getV23LyricsBy() : getV24LyricsBy();
    }

    public MPEGVersion getMPEGVersion() {
        return this.mpegFrame.getMPEGFrameHeader().getMPEGVersion();
    }

    public String getMusicBy() {
        return this.id3v23Tag != null ? getV23MusicBy() : getV24MusicBy();
    }

    public String getMusicType() {
        return this.id3v23Tag != null ? getV23MusicType() : getV24MusicType();
    }

    public AttachedPicture getPicture(PictureType pictureType) {
        return this.id3v23Tag != null ? getV23AttachedPicture(pictureType) : getV24AttachedPicture(pictureType);
    }

    public List<AttachedPicture> getPictures() {
        return this.id3v23Tag != null ? getV23AttachedPictures() : getV24AttachedPictures();
    }

    public String getPublisher() {
        return this.id3v23Tag != null ? getV23Publisher() : getV24Publisher();
    }

    public int getRating() {
        return this.id3v23Tag != null ? getV23Rating() : getV24Rating();
    }

    public List<SynchronizedLyric> getSynchronizedLyrics() {
        return getSynchronizedLyrics(Language.ENG);
    }

    public String getTitle() {
        return this.id3v23Tag != null ? getV23Title() : getV24Title();
    }

    public int getTrack() {
        return this.id3v23Tag != null ? getV23Track() : getV24Track();
    }

    public ID3TagVersion getVersion() {
        ID3v23Tag iD3v23Tag = this.id3v23Tag;
        return iD3v23Tag != null ? iD3v23Tag.getVersion() : this.id3v24Tag.getVersion();
    }

    public int getYear() {
        return this.id3v23Tag != null ? getV23Year() : getV24Year();
    }

    public void removeAlbum() throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23Album();
        } else {
            removeV24Album();
        }
    }

    public void removeAudioDuration() throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23AudioDuration();
        } else {
            removeV24AudioDuration();
        }
    }

    public void removeAudioSize() throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23AudioDuration();
        } else {
            removeV24AudioDuration();
        }
    }

    public void removeBand() throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23Band();
        } else {
            removeV24Band();
        }
    }

    public void removeComments() throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23Comments();
        } else {
            removeV24Comments();
        }
    }

    public void removeDisc() throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23Disc();
        } else {
            removeV24Disc();
        }
    }

    public void removeLeadPerformer() throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23LeadPerformer();
        } else {
            removeV24LeadPerformer();
        }
    }

    public void removeLyrics() throws IllegalStateException {
        removeLyrics(Language.ENG);
    }

    public void removeLyricsBy() throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23LyricsBy();
        } else {
            removeV24LyricsBy();
        }
    }

    public void removeMusicBy() throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23MusicBy();
        } else {
            removeV24MusicBy();
        }
    }

    public void removeMusicType() throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23MusicType();
        } else {
            removeV24MusicType();
        }
    }

    public void removePicture(PictureType pictureType) throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23AttachedPicture(pictureType);
        } else {
            removeV24AttachedPicture(pictureType);
        }
    }

    public List<AttachedPicture> removePictures() throws IllegalStateException {
        if (this.mp3File != null) {
            return this.id3v23Tag != null ? removeV23AttachedPictures() : removeV24AttachedPictures();
        }
        throw new IllegalStateException(getReadOnlyErrorMessage());
    }

    public void removePublisher() throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23Publisher();
        } else {
            removeV24Publisher();
        }
    }

    public void removeRating() throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23Rating();
        } else {
            removeV24Rating();
        }
    }

    public void removeSynchronizedLyrics() throws IllegalStateException {
        removeSynchronizedLyrics(Language.ENG);
    }

    public void removeTitle() throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23Title();
        } else {
            removeV24Title();
        }
    }

    public void removeTrack() throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23Track();
        } else {
            removeV24Track();
        }
    }

    public void removeYear() throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23Year();
        } else {
            removeV24Year();
        }
    }

    public void save() throws Throwable {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            saveID3v23();
        } else {
            saveID3v24();
        }
        readMP3File(this.mp3File);
    }

    public void setAlbum(String str) throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            setV23Album(str);
        } else {
            setV24Album(str);
        }
    }

    public void setAudioDuration() throws IllegalStateException, IllegalArgumentException {
        int iCalculateAudioDuration = calculateAudioDuration();
        if (iCalculateAudioDuration > 0) {
            setAudioDuration(iCalculateAudioDuration);
        }
    }

    public void setAudioSize(int i) throws IllegalStateException, IllegalArgumentException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            setV23AudioSize(i);
        } else {
            this.audioSize = i;
        }
    }

    public void setBand(String str) throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            setV23Band(str);
        } else {
            setV24Band(str);
        }
    }

    public void setComments(String str) throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            setV23Comments(Language.ENG, str);
        } else {
            setV24Comments(Language.ENG, str);
        }
    }

    public void setDisc(int i) throws IllegalStateException, IllegalArgumentException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            setV23Disc(i);
        } else {
            setV24Disc(i);
        }
    }

    public void setLeadPerformer(String str) throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            setV23LeadPerformer(str);
        } else {
            setV24LeadPerformer(str);
        }
    }

    public void setLyrics(String str) throws IllegalStateException {
        setLyrics(Language.ENG, str);
    }

    public void setLyricsBy(String str) throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            setV23LyricsBy(str);
        } else {
            setV24LyricsBy(str);
        }
    }

    public void setMusicBy(String str) throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            setV23MusicBy(str);
        } else {
            setV24MusicBy(str);
        }
    }

    public void setMusicType(Genre genre) throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            setV23MusicType(genre);
        } else {
            setV24MusicType(genre);
        }
    }

    public void setPicture(PictureType pictureType, String str) throws IllegalStateException, IOException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        setPicture(pictureType, new File(str));
    }

    public void setPublisher(String str) throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            setV23Publisher(str);
        } else {
            setV24Publisher(str);
        }
    }

    public void setRating(int i) throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            setV23Rating(i);
        } else {
            setV24Rating(i);
        }
    }

    public void setSynchronizedLyrics(SynchronizedLyric[] synchronizedLyricArr) throws IllegalStateException {
        setSynchronizedLyrics(Language.ENG, synchronizedLyricArr);
    }

    public void setTitle(String str) throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            setV23Title(str);
        } else {
            setV24Title(str);
        }
    }

    public void setTitleFromFilename() throws IllegalStateException {
        File file = this.mp3File;
        if (file == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        String path = file.getPath();
        String strSubstring = path.substring(0, path.length() - 4);
        if (strSubstring.lastIndexOf(File.separatorChar) != -1) {
            strSubstring = strSubstring.substring(strSubstring.lastIndexOf(File.separatorChar) + 1, strSubstring.length());
        } else if (System.getProperty("os.name").equals("Windows") && strSubstring.lastIndexOf(":") != -1) {
            strSubstring = strSubstring.substring(strSubstring.lastIndexOf(":") + 1, strSubstring.length());
        }
        if (this.id3v23Tag != null) {
            setV23Title(strSubstring);
        } else {
            setV24Title(strSubstring);
        }
    }

    public void setTrack(int i) throws IllegalStateException, IllegalArgumentException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            setV23Track(i);
        } else {
            setV24Track(i);
        }
    }

    public void setYear(int i) throws IllegalStateException, IllegalArgumentException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            setV23Year(i);
        } else {
            setV24Year(i);
        }
    }

    @Override // com.beaglebuddy.mp3.MP3Base
    public String toString() {
        return super.toString();
    }

    public MP3(File file) throws IOException {
        super(file);
    }

    public String getLyrics(Language language) {
        return this.id3v23Tag != null ? getV23UnsynchronizedLyrics(language) : getV24UnsynchronizedLyrics(language);
    }

    public List<SynchronizedLyric> getSynchronizedLyrics(Language language) {
        return this.id3v23Tag != null ? getV23SynchronizedLyrics(language) : getV24SynchronizedLyrics(language);
    }

    public void removeLyrics(Language language) throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23UnsynchronizedLyrics(language);
        } else {
            removeV24UnsynchronizedLyrics(language);
        }
    }

    public void removeSynchronizedLyrics(Language language) throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            removeV23SynchronizedLyrics(language);
        } else {
            removeV24SynchronizedLyrics(language);
        }
    }

    public void setLyrics(Language language, String str) throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (this.id3v23Tag != null) {
            setV23UnsynchronizedLyrics(language, str);
        } else {
            setV24UnsynchronizedLyrics(language, str);
        }
    }

    public void setSynchronizedLyrics(Language language, SynchronizedLyric[] synchronizedLyricArr) throws IllegalStateException {
        if (this.mp3File == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        Vector vector = new Vector();
        if (synchronizedLyricArr != null && synchronizedLyricArr.length != 0) {
            for (SynchronizedLyric synchronizedLyric : synchronizedLyricArr) {
                vector.add(synchronizedLyric);
            }
        }
        setSynchronizedLyrics(language, vector);
    }

    public MP3(URL url) throws IOException {
        super(url);
    }

    public void setAudioDuration(int i) throws IllegalStateException, IllegalArgumentException {
        if (this.mp3File != null) {
            if (this.id3v23Tag != null) {
                setV23AudioDuration(i);
                return;
            } else {
                setV24AudioDuration(i);
                return;
            }
        }
        throw new IllegalStateException(getReadOnlyErrorMessage());
    }

    public MP3(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    public void setPicture(PictureType pictureType, File file) throws IllegalStateException, IOException {
        if (this.mp3File != null) {
            setPicture(new AttachedPicture(pictureType, file));
            return;
        }
        throw new IllegalStateException(getReadOnlyErrorMessage());
    }

    public void setMusicType(String str) throws IllegalStateException {
        if (this.mp3File != null) {
            if (this.id3v23Tag != null) {
                setV23MusicType(str);
                return;
            } else {
                setV24MusicType(str);
                return;
            }
        }
        throw new IllegalStateException(getReadOnlyErrorMessage());
    }

    public void setPicture(PictureType pictureType, URL url) throws IllegalStateException, IOException {
        if (this.mp3File != null) {
            setPicture(new AttachedPicture(pictureType, url));
            return;
        }
        throw new IllegalStateException(getReadOnlyErrorMessage());
    }

    public void setSynchronizedLyrics(List<SynchronizedLyric> list) throws IllegalStateException {
        setSynchronizedLyrics(Language.ENG, list);
    }

    public void setPicture(AttachedPicture attachedPicture) throws IllegalStateException {
        File file = this.mp3File;
        if (file == null) {
            throw new IllegalStateException(getReadOnlyErrorMessage());
        }
        if (file != null) {
            if (this.id3v23Tag != null) {
                setV23AttachedPicture(attachedPicture);
                return;
            } else {
                setV24AttachedPicture(attachedPicture);
                return;
            }
        }
        throw new IllegalStateException(getReadOnlyErrorMessage());
    }

    public void setSynchronizedLyrics(Language language, List<SynchronizedLyric> list) throws IllegalStateException {
        if (this.mp3File != null) {
            if (list != null && list.size() != 0) {
                if (this.id3v23Tag != null) {
                    setV23SynchronizedLyrics(language, list);
                    return;
                } else {
                    setV24SynchronizedLyrics(language, list);
                    return;
                }
            }
            if (this.id3v23Tag != null) {
                removeV23SynchronizedLyrics(language);
                return;
            } else {
                removeV24SynchronizedLyrics(language);
                return;
            }
        }
        throw new IllegalStateException(getReadOnlyErrorMessage());
    }
}
