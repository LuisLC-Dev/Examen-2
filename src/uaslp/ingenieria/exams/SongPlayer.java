package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import javax.sound.midi.Instrument;
import java.util.Iterator;
import java.util.List;

public class SongPlayer {

    public void play(Song song, Instrumento instrumento) {


        Iterator<Nota> notas = song.getSongIterator();

        List<Instrument> Ins;

        Ins.addAll();
        instrument inst = new Instrument();
        for(Iterator iterator : Ins.size())
        {
            if (Ins.get(iterator)==instrumento)
        inst = Ins.get(iterator);
        }

        while (notas.hasNext()) {
            Nota nota = notas.next();

            inst.playI(nota);
        }

    }

}
